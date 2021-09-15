package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.FindPetsByStatusP;
import id.mandiri.nbds.model.FindPetsByStatusResponseWrapper;
import id.mandiri.nbds.services.FindPetsByStatusI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class FindPetsByStatusImpl implements FindPetsByStatusI {
 
    private static final Log logger = LogFactory.getLog(FindPetsByStatusImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public FindPetsByStatusResponseWrapper execute(FindPetsByStatusP requestParams){
        //TODO
        return new FindPetsByStatusResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
