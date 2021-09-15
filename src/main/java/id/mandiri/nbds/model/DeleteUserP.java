package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;

public class DeleteUserP {

    private String username;

    public DeleteUserP() {

    }

    public DeleteUserP(String username) {
        this.username = username;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

}
