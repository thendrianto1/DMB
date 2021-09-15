package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.FindPetsByTagsP;
import id.mandiri.nbds.model.FindPetsByTagsResponseWrapper;
import id.mandiri.nbds.services.FindPetsByTagsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class FindPetsByTagsImpl implements FindPetsByTagsI {
 
    private static final Log logger = LogFactory.getLog(FindPetsByTagsImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public FindPetsByTagsResponseWrapper execute(FindPetsByTagsP requestParams){
        //TODO
        return new FindPetsByTagsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
