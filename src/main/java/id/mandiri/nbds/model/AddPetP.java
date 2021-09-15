package id.mandiri.nbds.model;

import id.mandiri.nbds.model.Pet;
import org.springframework.http.ResponseEntity;

public class AddPetP {

    private Pet body;

    public AddPetP() {

    }

    public AddPetP(Pet body) {
        this.body = body;
    }

    public Pet getBody () {
        return body;
    }

    public void setBody (Pet body) {
        this.body = body;
    }

}
