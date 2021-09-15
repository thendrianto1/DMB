package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.GetOrderByIdP;
import id.mandiri.nbds.model.GetOrderByIdResponseWrapper;
import id.mandiri.nbds.services.GetOrderByIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetOrderByIdImpl implements GetOrderByIdI {
 
    private static final Log logger = LogFactory.getLog(GetOrderByIdImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public GetOrderByIdResponseWrapper execute(GetOrderByIdP requestParams){
        //TODO
        return new GetOrderByIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
