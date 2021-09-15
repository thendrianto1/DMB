package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.AddPetP;
import id.mandiri.nbds.model.AddPetResponseWrapper;
import id.mandiri.nbds.services.AddPetI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class AddPetImpl implements AddPetI {
 
    private static final Log logger = LogFactory.getLog(AddPetImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public AddPetResponseWrapper execute(AddPetP requestParams){
        //TODO
        return new AddPetResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
