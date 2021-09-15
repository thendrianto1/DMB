package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.GetPetByIdP;
import id.mandiri.nbds.model.GetPetByIdResponseWrapper;
import id.mandiri.nbds.services.GetPetByIdI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class GetPetByIdImpl implements GetPetByIdI {
 
    private static final Log logger = LogFactory.getLog(GetPetByIdImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public GetPetByIdResponseWrapper execute(GetPetByIdP requestParams){
        //TODO
        return new GetPetByIdResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
