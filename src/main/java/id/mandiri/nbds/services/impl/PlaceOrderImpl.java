package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.PlaceOrderP;
import id.mandiri.nbds.model.PlaceOrderResponseWrapper;
import id.mandiri.nbds.services.PlaceOrderI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class PlaceOrderImpl implements PlaceOrderI {
 
    private static final Log logger = LogFactory.getLog(PlaceOrderImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public PlaceOrderResponseWrapper execute(PlaceOrderP requestParams){
        //TODO
        return new PlaceOrderResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
