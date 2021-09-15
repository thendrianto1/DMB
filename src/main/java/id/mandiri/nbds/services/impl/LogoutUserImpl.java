package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.LogoutUserP;
import id.mandiri.nbds.model.LogoutUserResponseWrapper;
import id.mandiri.nbds.services.LogoutUserI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class LogoutUserImpl implements LogoutUserI {
 
    private static final Log logger = LogFactory.getLog(LogoutUserImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public LogoutUserResponseWrapper execute(LogoutUserP requestParams){
        //TODO
        return new LogoutUserResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
