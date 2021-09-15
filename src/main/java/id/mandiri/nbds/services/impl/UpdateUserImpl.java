package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.UpdateUserP;
import id.mandiri.nbds.model.UpdateUserResponseWrapper;
import id.mandiri.nbds.services.UpdateUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UpdateUserImpl implements UpdateUserI {
 
    private static final Log logger = LogFactory.getLog(UpdateUserImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UpdateUserResponseWrapper execute(UpdateUserP requestParams){
        //TODO
        return new UpdateUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
