package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.UpdatePetP;
import id.mandiri.nbds.model.UpdatePetResponseWrapper;
import id.mandiri.nbds.services.UpdatePetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UpdatePetImpl implements UpdatePetI {
 
    private static final Log logger = LogFactory.getLog(UpdatePetImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UpdatePetResponseWrapper execute(UpdatePetP requestParams){
        //TODO
        return new UpdatePetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
