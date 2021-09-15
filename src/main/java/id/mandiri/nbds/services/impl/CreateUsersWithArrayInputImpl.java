package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.CreateUsersWithArrayInputP;
import id.mandiri.nbds.model.CreateUsersWithArrayInputResponseWrapper;
import id.mandiri.nbds.services.CreateUsersWithArrayInputI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class CreateUsersWithArrayInputImpl implements CreateUsersWithArrayInputI {
 
    private static final Log logger = LogFactory.getLog(CreateUsersWithArrayInputImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public CreateUsersWithArrayInputResponseWrapper execute(CreateUsersWithArrayInputP requestParams){
        //TODO
        return new CreateUsersWithArrayInputResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
