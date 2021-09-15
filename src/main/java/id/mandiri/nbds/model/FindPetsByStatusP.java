package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.List;
import id.mandiri.nbds.model.Pet;

public class FindPetsByStatusP {

    private List<String> status;

    public FindPetsByStatusP() {

    }

    public FindPetsByStatusP(List<String> status) {
        this.status = status;
    }

    public List<String> getStatus () {
        return status;
    }

    public void setStatus (List<String> status) {
        this.status = status;
    }

}
