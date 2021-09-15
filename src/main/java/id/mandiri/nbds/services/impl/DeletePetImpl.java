package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.DeletePetP;
import id.mandiri.nbds.model.DeletePetResponseWrapper;
import id.mandiri.nbds.services.DeletePetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class DeletePetImpl implements DeletePetI {
 
    private static final Log logger = LogFactory.getLog(DeletePetImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public DeletePetResponseWrapper execute(DeletePetP requestParams){
        //TODO
        return new DeletePetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
