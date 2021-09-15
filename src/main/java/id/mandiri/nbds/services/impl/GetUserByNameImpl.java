package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.GetUserByNameP;
import id.mandiri.nbds.model.GetUserByNameResponseWrapper;
import id.mandiri.nbds.services.GetUserByNameI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetUserByNameImpl implements GetUserByNameI {
 
    private static final Log logger = LogFactory.getLog(GetUserByNameImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public GetUserByNameResponseWrapper execute(GetUserByNameP requestParams){
        //TODO
        return new GetUserByNameResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
