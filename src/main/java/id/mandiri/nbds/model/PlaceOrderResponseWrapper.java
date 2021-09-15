package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.util.MultiValueMap;
import org.springframework.util.LinkedMultiValueMap;

import id.mandiri.nbds.model.Order;
import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.Order;


public class PlaceOrderResponseWrapper {

	private Order response;
        
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
 
	public Order getResponse(){
            return response;
	}
 
	public void setResponse(Order response){
            this.response=response;
	}  
}
