package id.mandiri.nbds.model;

import id.mandiri.nbds.model.User;
import org.springframework.http.ResponseEntity;

public class CreateUserP {

    private User body;

    public CreateUserP() {

    }

    public CreateUserP(User body) {
        this.body = body;
    }

    public User getBody () {
        return body;
    }

    public void setBody (User body) {
        this.body = body;
    }

}
