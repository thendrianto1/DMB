package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.GetInventoryP;
import id.mandiri.nbds.model.GetInventoryResponseWrapper;
import id.mandiri.nbds.services.GetInventoryI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetInventoryImpl implements GetInventoryI {
 
    private static final Log logger = LogFactory.getLog(GetInventoryImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public GetInventoryResponseWrapper execute(GetInventoryP requestParams){
        //TODO
        return new GetInventoryResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
