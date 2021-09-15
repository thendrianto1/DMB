package id.mandiri.nbds.exception;

import java.io.IOException;
import java.util.Map;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import id.mandiri.nbds.services.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.mandiri.nbds.exception.Error.SeverityEnum;

/**
 * 
 * SwaggerpetstoreExceptionHandler is a controller advice which captures any of the exceptions in the process of api execution.
 *
 */
@ControllerAdvice
public class SwaggerpetstoreExceptionHandler extends ResponseEntityExceptionHandler{

	private static final Logger log = LoggerFactory.getLogger(SwaggerpetstoreExceptionHandler.class);

	private static final String FAILED = "FAILED";

	//#AutowireServices
	@Autowired
	private UpdatePetI updatePetI;
	@Autowired
	private AddPetI addPetI;
	@Autowired
	private FindPetsByStatusI findPetsByStatusI;
	@Autowired
	private FindPetsByTagsI findPetsByTagsI;
	@Autowired
	private GetPetByIdI getPetByIdI;
	@Autowired
	private UpdatePetWithFormI updatePetWithFormI;
	@Autowired
	private DeletePetI deletePetI;
	@Autowired
	private PlaceOrderI placeOrderI;
	@Autowired
	private GetOrderByIdI getOrderByIdI;
	@Autowired
	private DeleteOrderI deleteOrderI;
	@Autowired
	private LoginUserI loginUserI;
	@Autowired
	private GetUserByNameI getUserByNameI;
	@Autowired
	private UpdateUserI updateUserI;
	@Autowired
	private DeleteUserI deleteUserI;



	private HttpHeaders getResponseHeaders(WebRequest request) {
		// get header values
		// response headers created first
		final MultiValueMap<String, String> map = buildResponseMap();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.putAll(map);
		//TODO return headers for responses
		return httpHeaders;
	}

	private MultiValueMap<String, String> buildResponseMap() {
		final MultiValueMap<String, String> map;
		map = new LinkedMultiValueMap<>();		
		return map;
	}

	@ExceptionHandler(value = { 
			ConstraintViolationException.class,
			IllegalArgumentException.class })
	protected ResponseEntity<Object> handleRequestException(Exception exception, WebRequest request){
		// build header responses
		final HttpHeaders httpHeaders = getResponseHeaders(request);
		//Building API specific Exception Response Body
		Object object = getApiSpecificErrorResponse(request,httpHeaders,ErrorStatusCode.BAD_REQUEST,exception);
		if(null != object){			
			return ResponseEntity.status(ErrorStatusCode.BAD_REQUEST.getCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body(object);
		}

		// building default error response
		ErrorResponse errorResponse = ErrorResponse.instance(SeverityEnum.ERROR, exception, exception.getMessage(),ErrorStatusCode.BAD_REQUEST.getCode()+"", FAILED, true, String.valueOf(HttpStatus.BAD_REQUEST.value()));		
		// global log
		log.error("global error occured in controller, cause: " + exception.getMessage(), exception);
		// send error response
		return ResponseEntity.status(ErrorStatusCode.BAD_REQUEST.getCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body((Object)errorResponse);
	}

	/**
	 * SwaggerpetstoreException handler
	 * @param SwaggerpetstoreException
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value = { SwaggerpetstoreException.class })
	protected ResponseEntity<Object> handleRequestException(SwaggerpetstoreException exception, WebRequest request) {
		// build header responses
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		// send error response
		return ResponseEntity.status(exception.getHttpCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON)
				.body((Object)exception.getErrorResponse());
	}

	/**
	 * Internal server Error -500
	 * @param exception
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<Object> handleGeneralException(Exception exception, WebRequest request) {
		// build error response
		final ErrorResponse errorResponse;
		// build headers
		final HttpHeaders httpHeaders = getResponseHeaders(request);
		//Building API specific Exception Response Body
		Object object = getApiSpecificErrorResponse(request,httpHeaders,ErrorStatusCode.INTERNAL_SERVER_ERROR,exception);
		if(null != object){			
			return ResponseEntity.status(ErrorStatusCode.INTERNAL_SERVER_ERROR.getCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body(object);
		}
		// global log
		log.error("global error occured in controller, cause: " + exception.getMessage(), exception);		
		// building default error response
		errorResponse = ErrorResponse.instance(SeverityEnum.ERROR, exception, exception.getMessage(),""+ErrorStatusCode.INTERNAL_SERVER_ERROR.getCode(), FAILED, true,String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));

		// send error response
		return ResponseEntity.status(ErrorStatusCode.INTERNAL_SERVER_ERROR.getCode()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body((Object)errorResponse);
	}

	/**
	 * Http Server Error
	 * @param HttpStatusCodeException httpStatusCodeException
	 * @param WebRequest request
	 * @return ResponseEntity<ErrorResponse>
	 */
	@ExceptionHandler(value = { HttpClientErrorException.class, HttpServerErrorException.class })
	protected ResponseEntity<Object> handleHTTPException(HttpStatusCodeException httpStatusCodeException, WebRequest request) {
		// build error response
		log.info("Entered CustomExceptionHandler::handleHTTPException::");
		final String errorResponseText = httpStatusCodeException.getResponseBodyAsString();
		final ObjectMapper mapper = new ObjectMapper();
		// building default error response
		ErrorResponse errorResponse = new ErrorResponse();

		try {
			errorResponse = mapper.readValue(errorResponseText, ErrorResponse.class);
		} catch (IOException ioException) {
			log.error("cannot read error response [" + errorResponseText
					+ "] to convert to Object --> ErrorResponse, cause: " + ioException.getMessage(), ioException);
		}

		// build headers
		final HttpHeaders httpHeaders = getResponseHeaders(request);

		ErrorStatusCode statusCode = ErrorStatusCode.getStatusCode(httpStatusCodeException.getStatusCode().value());
		Object object = getApiSpecificErrorResponse(request,httpHeaders,statusCode,httpStatusCodeException);
		if(null != object){			
			return ResponseEntity.status(httpStatusCodeException.getStatusCode().value()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body(object);
		}
		// global log
		log.error("HTTP Server error occured in controller, cause: " + httpStatusCodeException.getMessage(), httpStatusCodeException);

		// send error response
		return ResponseEntity.status(httpStatusCodeException.getStatusCode().value()).headers(httpHeaders).contentType(MediaType.APPLICATION_JSON).body((Object)errorResponse);
	}


	private Object getApiSpecificErrorResponse(WebRequest request,HttpHeaders httpHeaders,ErrorStatusCode code,Exception exception){
		log.info("Entered CustomExceptionHandler::getApiSpecificErrorResponse::");
		Object object=null;
		String operationId = (String) request.getAttribute("operationId",0);
		log.info("operationId to getApiSpecificErrorResponse :: {} ",operationId);
		if(null != operationId && !"".equals(operationId)) {
			object = getErrorObject(operationId,code,exception);
		}
		return object;
	}

	@SuppressWarnings("unchecked")
	private Object getErrorObject(String operationId,ErrorStatusCode code,Exception exception){
		log.info("Entered CustomExceptionHandler::getErrorObject:: ");
		Object object= null;
		Map<ErrorStatusCode, ApiExceptionResponse> errorRes = MetaData.apiExceptions.get(operationId);
		ApiExceptionResponse apiExceptionResponse = errorRes.get(code);	
		if(apiExceptionResponse != null) {
			try {
				switch(operationId){
			case "updatePet":
			object = updatePetI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "addPet":
			object = addPetI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "findPetsByStatus":
			object = findPetsByStatusI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "findPetsByTags":
			object = findPetsByTagsI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "getPetById":
			object = getPetByIdI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "updatePetWithForm":
			object = updatePetWithFormI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "deletePet":
			object = deletePetI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "placeOrder":
			object = placeOrderI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "getOrderById":
			object = getOrderByIdI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "deleteOrder":
			object = deleteOrderI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "loginUser":
			object = loginUserI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "getUserByName":
			object = getUserByNameI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "updateUser":
			object = updateUserI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			
			case "deleteUser":
			object = deleteUserI.error(code.getCode(),apiExceptionResponse.getDataType(),exception);
			break;
			

			default: 
				object = null;
			}
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		return object;
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error("global Error occured in controller, cause: " + ex.getMessage(), ex);
		ErrorResponse errorResponse = ErrorResponse.instance(SeverityEnum.ERROR, ex, ex.getMessage(),
				ErrorStatusCode.METHOD_NOT_FOUND.getCode() + "", FAILED, true,
				String.valueOf(HttpStatus.METHOD_NOT_ALLOWED.value()));

		return new ResponseEntity<Object>(errorResponse, HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.error("global error occured in controller, cause: " + ex.getMessage(), ex);
		ErrorResponse errorResponse = ErrorResponse.instance(SeverityEnum.ERROR, ex, ex.getMessage(),
				ErrorStatusCode.BAD_REQUEST.getCode() + "", FAILED, true,
				String.valueOf(HttpStatus.BAD_REQUEST.value()));

		return new ResponseEntity<Object>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
