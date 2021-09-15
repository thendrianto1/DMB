package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.ModelApiResponse;


public class UploadFileResponseWrapper {

	private ModelApiResponse response;
        
        private MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();

        public MultiValueMap<String, String> getHeaders(){
            return this.headers;
	}

	public void setHeaders(MultiValueMap<String,String> headers){
            this.headers = headers;
	}
        
        public void addHeaders(String header, List<String> value) {
            headers.put(header, value);
        }
 
	public ModelApiResponse getResponse(){
            return response;
	}
 
	public void setResponse(ModelApiResponse response){
            this.response=response;
	}  
}
