package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;

public class DeleteOrderP {

    private Long orderId;

    public DeleteOrderP() {

    }

    public DeleteOrderP(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId () {
        return orderId;
    }

    public void setOrderId (Long orderId) {
        this.orderId = orderId;
    }

}
