package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.Pet;

public class GetPetByIdP {

    private Long petId;

    public GetPetByIdP() {

    }

    public GetPetByIdP(Long petId) {
        this.petId = petId;
    }

    public Long getPetId () {
        return petId;
    }

    public void setPetId (Long petId) {
        this.petId = petId;
    }

}
