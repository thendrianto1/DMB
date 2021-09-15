package id.mandiri.nbds.model;

import java.util.List;
import id.mandiri.nbds.model.User;
import org.springframework.http.ResponseEntity;

public class CreateUsersWithListInputP {

    private List<User> body;

    public CreateUsersWithListInputP() {

    }

    public CreateUsersWithListInputP(List<User> body) {
        this.body = body;
    }

    public List<User> getBody () {
        return body;
    }

    public void setBody (List<User> body) {
        this.body = body;
    }

}
