package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.UpdatePetWithFormP;
import id.mandiri.nbds.model.UpdatePetWithFormResponseWrapper;
import id.mandiri.nbds.services.UpdatePetWithFormI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UpdatePetWithFormImpl implements UpdatePetWithFormI {
 
    private static final Log logger = LogFactory.getLog(UpdatePetWithFormImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UpdatePetWithFormResponseWrapper execute(UpdatePetWithFormP requestParams){
        //TODO
        return new UpdatePetWithFormResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
