package id.mandiri.nbds.api;

import java.util.List;
import id.mandiri.nbds.model.User;
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
import id.mandiri.nbds.services.CreateUserI;
import id.mandiri.nbds.model.CreateUserP;
import id.mandiri.nbds.model.CreateUserResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import id.mandiri.nbds.services.CreateUsersWithArrayInputI;
import id.mandiri.nbds.model.CreateUsersWithArrayInputP;
import id.mandiri.nbds.model.CreateUsersWithArrayInputResponseWrapper;
import id.mandiri.nbds.services.CreateUsersWithListInputI;
import id.mandiri.nbds.model.CreateUsersWithListInputP;
import id.mandiri.nbds.model.CreateUsersWithListInputResponseWrapper;
import id.mandiri.nbds.services.LoginUserI;
import id.mandiri.nbds.model.LoginUserP;
import id.mandiri.nbds.model.LoginUserResponseWrapper;
import id.mandiri.nbds.services.LogoutUserI;
import id.mandiri.nbds.model.LogoutUserP;
import id.mandiri.nbds.model.LogoutUserResponseWrapper;
import id.mandiri.nbds.services.GetUserByNameI;
import id.mandiri.nbds.model.GetUserByNameP;
import id.mandiri.nbds.model.GetUserByNameResponseWrapper;
import id.mandiri.nbds.services.UpdateUserI;
import id.mandiri.nbds.model.UpdateUserP;
import id.mandiri.nbds.model.UpdateUserResponseWrapper;
import id.mandiri.nbds.services.DeleteUserI;
import id.mandiri.nbds.model.DeleteUserP;
import id.mandiri.nbds.model.DeleteUserResponseWrapper;

@RestController
public class UserApiController implements UserApi {

	@Autowired
	DeleteUserI deleteUserI;


	@Autowired
	UpdateUserI updateUserI;


	@Autowired
	GetUserByNameI getUserByNameI;


	@Autowired
	LogoutUserI logoutUserI;


	@Autowired
	LoginUserI loginUserI;


	@Autowired
	CreateUsersWithListInputI createUsersWithListInputI;


	@Autowired
	CreateUsersWithArrayInputI createUsersWithArrayInputI;


	@Autowired
	CreateUserI createUserI;


    public ResponseEntity<Void> createUser(@ApiParam(value = "Created user object" ,required=true )  @Valid @RequestBody User body){
        
        CreateUserResponseWrapper res  = createUserI.execute(new CreateUserP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> createUsersWithArrayInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body){
        
        CreateUsersWithArrayInputResponseWrapper res  = createUsersWithArrayInputI.execute(new CreateUsersWithArrayInputP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> createUsersWithListInput(@ApiParam(value = "List of user object" ,required=true )  @Valid @RequestBody List<User> body){
        
        CreateUsersWithListInputResponseWrapper res  = createUsersWithListInputI.execute(new CreateUsersWithListInputP(body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username){
        
        DeleteUserResponseWrapper res  = deleteUserI.execute(new DeleteUserP(username));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing.",required=true) @PathVariable("username") String username){
        
        GetUserByNameResponseWrapper res  = getUserByNameI.execute(new GetUserByNameP(username));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<String> loginUser(@NotNull @ApiParam(value = "The user name for login", required = true) @Valid @RequestParam(value = "username", required = true) String username,@NotNull @ApiParam(value = "The password for login in clear text", required = true) @Valid @RequestParam(value = "password", required = true) String password){
        
        LoginUserResponseWrapper res  = loginUserI.execute(new LoginUserP(username, password));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> logoutUser(){
        
        LogoutUserResponseWrapper res  = logoutUserI.execute(new LogoutUserP());

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

    public ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("username") String username,@ApiParam(value = "Updated user object" ,required=true )  @Valid @RequestBody User body){
        
        UpdateUserResponseWrapper res  = updateUserI.execute(new UpdateUserP(username, body));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
    }
    

}
