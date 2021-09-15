package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.DeleteOrderP;
import id.mandiri.nbds.model.DeleteOrderResponseWrapper;
import id.mandiri.nbds.services.DeleteOrderI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class DeleteOrderImpl implements DeleteOrderI {
 
    private static final Log logger = LogFactory.getLog(DeleteOrderImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public DeleteOrderResponseWrapper execute(DeleteOrderP requestParams){
        //TODO
        return new DeleteOrderResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
