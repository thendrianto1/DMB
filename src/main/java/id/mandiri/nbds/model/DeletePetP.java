package id.mandiri.nbds.model;

import org.springframework.http.ResponseEntity;

public class DeletePetP {

    private Long petId;
    private String apiKey;

    public DeletePetP() {

    }

    public DeletePetP(Long petId,String apiKey) {
        this.petId = petId;
        this.apiKey = apiKey;
    }

    public Long getPetId () {
        return petId;
    }

    public void setPetId (Long petId) {
        this.petId = petId;
    }
    public String getApiKey () {
        return apiKey;
    }

    public void setApiKey (String apiKey) {
        this.apiKey = apiKey;
    }

}
