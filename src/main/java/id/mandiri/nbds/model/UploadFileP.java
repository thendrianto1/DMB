package id.mandiri.nbds.model;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import id.mandiri.nbds.model.ModelApiResponse;

public class UploadFileP {

    private Long petId;
    private String additionalMetadata;
    private MultipartFile file;

    public UploadFileP() {

    }

    public UploadFileP(Long petId,String additionalMetadata,MultipartFile file) {
        this.petId = petId;
        this.additionalMetadata = additionalMetadata;
        this.file = file;
    }

    public Long getPetId () {
        return petId;
    }

    public void setPetId (Long petId) {
        this.petId = petId;
    }
    public String getAdditionalMetadata () {
        return additionalMetadata;
    }

    public void setAdditionalMetadata (String additionalMetadata) {
        this.additionalMetadata = additionalMetadata;
    }
    public MultipartFile getFile () {
        return file;
    }

    public void setFile (MultipartFile file) {
        this.file = file;
    }

}
