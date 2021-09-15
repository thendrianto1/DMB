package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.Order;

public class GetOrderByIdP {

    private Long orderId;

    public GetOrderByIdP() {

    }

    public GetOrderByIdP(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId () {
        return orderId;
    }

    public void setOrderId (Long orderId) {
        this.orderId = orderId;
    }

}
