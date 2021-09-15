package id.mandiri.nbds.api;

import id.mandiri.nbds.model.ModelApiResponse;
import id.mandiri.nbds.model.Pet;
import org.springframework.core.io.Resource;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import id.mandiri.nbds.services.UpdatePetI;
import id.mandiri.nbds.model.UpdatePetP;
import id.mandiri.nbds.model.UpdatePetResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import id.mandiri.nbds.services.AddPetI;
import id.mandiri.nbds.model.AddPetP;
import id.mandiri.nbds.model.AddPetResponseWrapper;
import id.mandiri.nbds.services.FindPetsByStatusI;
import id.mandiri.nbds.model.FindPetsByStatusP;
import id.mandiri.nbds.model.FindPetsByStatusResponseWrapper;
import id.mandiri.nbds.services.FindPetsByTagsI;
import id.mandiri.nbds.model.FindPetsByTagsP;
import id.mandiri.nbds.model.FindPetsByTagsResponseWrapper;
import id.mandiri.nbds.services.GetPetByIdI;
import id.mandiri.nbds.model.GetPetByIdP;
import id.mandiri.nbds.model.GetPetByIdResponseWrapper;
import id.mandiri.nbds.services.UpdatePetWithFormI;
import id.mandiri.nbds.model.UpdatePetWithFormP;
import id.mandiri.nbds.model.UpdatePetWithFormResponseWrapper;
import id.mandiri.nbds.services.DeletePetI;
import id.mandiri.nbds.model.DeletePetP;
import id.mandiri.nbds.model.DeletePetResponseWrapper;
import id.mandiri.nbds.services.UploadFileI;
import id.mandiri.nbds.model.UploadFileP;
import id.mandiri.nbds.model.UploadFileResponseWrapper;

@RestController
public class PetApiController implements PetApi {

	@Autowired
	UploadFileI uploadFileI;


	@Autowired
	DeletePetI deletePetI;


	@Autowired
	UpdatePetWithFormI updatePetWithFormI;


	@Autowired
	GetPetByIdI getPetByIdI;


	@Autowired
	FindPetsByTagsI findPetsByTagsI;


	@Autowired
	FindPetsByStatusI findPetsByStatusI;


	@Autowired
	AddPetI addPetI;


	@Autowired
	UpdatePetI updatePetI;


    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body){
        
        AddPetResponseWrapper res  = addPetI.execute(new AddPetP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey){
        
        DeletePetResponseWrapper res  = deletePetI.execute(new DeletePetP(petId, apiKey));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status){
        
        FindPetsByStatusResponseWrapper res  = findPetsByStatusI.execute(new FindPetsByStatusP(status));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags){
        
        FindPetsByTagsResponseWrapper res  = findPetsByTagsI.execute(new FindPetsByTagsP(tags));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Long petId){
        
        GetPetByIdResponseWrapper res  = getPetByIdI.execute(new GetPetByIdP(petId));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody Pet body){
        
        UpdatePetResponseWrapper res  = updatePetI.execute(new UpdatePetP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Updated name of the pet") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "Updated status of the pet") @RequestParam(value="status", required=false)  String status){
        
        UpdatePetWithFormResponseWrapper res  = updatePetWithFormI.execute(new UpdatePetWithFormP(petId, name, status));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Additional data to pass to server") @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file){
        
        UploadFileResponseWrapper res  = uploadFileI.execute(new UploadFileP(petId, additionalMetadata, file));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
