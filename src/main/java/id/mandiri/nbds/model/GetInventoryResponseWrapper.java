package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import org.springframework.http.ResponseEntity;
import java.util.Map;


public class GetInventoryResponseWrapper {

	private Map<String, Integer> response;
        
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
 
	public Map<String, Integer> getResponse(){
            return response;
	}
 
	public void setResponse(Map<String, Integer> response){
            this.response=response;
	}  
}
