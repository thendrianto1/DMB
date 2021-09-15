package id.mandiri.nbds.model;

import id.mandiri.nbds.model.Pet;
import org.springframework.http.ResponseEntity;

public class UpdatePetP {

    private Pet body;

    public UpdatePetP() {

    }

    public UpdatePetP(Pet body) {
        this.body = body;
    }

    public Pet getBody () {
        return body;
    }

    public void setBody (Pet body) {
        this.body = body;
    }

}
