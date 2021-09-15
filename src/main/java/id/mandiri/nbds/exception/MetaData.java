package id.mandiri.nbds.exception;

import java.util.HashMap;
import java.util.Map;

import id.mandiri.nbds.exception.ApiExceptionResponse;
import id.mandiri.nbds.exception.ErrorStatusCode;
import id.mandiri.nbds.model.*;

public class MetaData {

	public static final Map<String,Map<ErrorStatusCode, ApiExceptionResponse>> apiExceptions;
	
	static {		
		apiExceptions = new HashMap<String,Map<ErrorStatusCode, ApiExceptionResponse>>();

		Map<ErrorStatusCode, ApiExceptionResponse> responses; 
		try {
		
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid ID supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Pet not found"));
		 responses.put(ErrorStatusCode.getStatusCode(405),ApiExceptionResponse.getInstance(405,Void.class,"Validation exception"));
		 
		 apiExceptions.put("updatePet",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(405),ApiExceptionResponse.getInstance(405,Void.class,"Invalid input"));
		 
		 apiExceptions.put("addPet",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid status value"));
		 
		 apiExceptions.put("findPetsByStatus",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid tag value"));
		 
		 apiExceptions.put("findPetsByTags",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid ID supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Pet not found"));
		 
		 apiExceptions.put("getPetById",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(405),ApiExceptionResponse.getInstance(405,Void.class,"Invalid input"));
		 
		 apiExceptions.put("updatePetWithForm",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid ID supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Pet not found"));
		 
		 apiExceptions.put("deletePet",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid Order"));
		 
		 apiExceptions.put("placeOrder",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid ID supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Order not found"));
		 
		 apiExceptions.put("getOrderById",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid ID supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"Order not found"));
		 
		 apiExceptions.put("deleteOrder",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid username/password supplied"));
		 
		 apiExceptions.put("loginUser",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid username supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"User not found"));
		 
		 apiExceptions.put("getUserByName",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid user supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"User not found"));
		 
		 apiExceptions.put("updateUser",responses);
		 
		 responses = new HashMap<ErrorStatusCode, ApiExceptionResponse>();
		 responses.put(ErrorStatusCode.getStatusCode(400),ApiExceptionResponse.getInstance(400,Void.class,"Invalid username supplied"));
		 responses.put(ErrorStatusCode.getStatusCode(404),ApiExceptionResponse.getInstance(404,Void.class,"User not found"));
		 
		 apiExceptions.put("deleteUser",responses);
		 
		
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}
