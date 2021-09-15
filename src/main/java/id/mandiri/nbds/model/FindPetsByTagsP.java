package id.mandiri.nbds.model;

import java.util.List;
import org.springframework.http.ResponseEntity;
import java.util.List;
import id.mandiri.nbds.model.Pet;

public class FindPetsByTagsP {

    private List<String> tags;

    public FindPetsByTagsP() {

    }

    public FindPetsByTagsP(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags () {
        return tags;
    }

    public void setTags (List<String> tags) {
        this.tags = tags;
    }

}
