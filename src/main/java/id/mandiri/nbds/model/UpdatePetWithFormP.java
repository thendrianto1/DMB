package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;

public class UpdatePetWithFormP {

    private Long petId;
    private String name;
    private String status;

    public UpdatePetWithFormP() {

    }

    public UpdatePetWithFormP(Long petId,String name,String status) {
        this.petId = petId;
        this.name = name;
        this.status = status;
    }

    public Long getPetId () {
        return petId;
    }

    public void setPetId (Long petId) {
        this.petId = petId;
    }
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

}
