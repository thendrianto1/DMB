package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.DeleteUserP;
import id.mandiri.nbds.model.DeleteUserResponseWrapper;
import id.mandiri.nbds.services.DeleteUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class DeleteUserImpl implements DeleteUserI {
 
    private static final Log logger = LogFactory.getLog(DeleteUserImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public DeleteUserResponseWrapper execute(DeleteUserP requestParams){
        //TODO
        return new DeleteUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
