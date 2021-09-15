package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.CreateUserP;
import id.mandiri.nbds.model.CreateUserResponseWrapper;
import id.mandiri.nbds.services.CreateUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class CreateUserImpl implements CreateUserI {
 
    private static final Log logger = LogFactory.getLog(CreateUserImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public CreateUserResponseWrapper execute(CreateUserP requestParams){
        //TODO
        return new CreateUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
