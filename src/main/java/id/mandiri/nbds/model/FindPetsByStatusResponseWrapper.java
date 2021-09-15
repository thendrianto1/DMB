package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.List;
import id.mandiri.nbds.model.Pet;


public class FindPetsByStatusResponseWrapper {

	private List<Pet> response;
        
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
 
	public List<Pet> getResponse(){
            return response;
	}
 
	public void setResponse(List<Pet> response){
            this.response=response;
	}  
}
