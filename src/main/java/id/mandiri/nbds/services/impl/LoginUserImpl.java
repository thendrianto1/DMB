package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.LoginUserP;
import id.mandiri.nbds.model.LoginUserResponseWrapper;
import id.mandiri.nbds.services.LoginUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class LoginUserImpl implements LoginUserI {
 
    private static final Log logger = LogFactory.getLog(LoginUserImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public LoginUserResponseWrapper execute(LoginUserP requestParams){
        //TODO
        return new LoginUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
