package id.mandiri.nbds.model;

import id.mandiri.nbds.model.Order;
import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.Order;

public class PlaceOrderP {

    private Order body;

    public PlaceOrderP() {

    }

    public PlaceOrderP(Order body) {
        this.body = body;
    }

    public Order getBody () {
        return body;
    }

    public void setBody (Order body) {
        this.body = body;
    }

}
