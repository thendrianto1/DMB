package id.mandiri.nbds.services.impl;
 
import java.util.*;
 
import id.mandiri.nbds.model.UploadFileP;
import id.mandiri.nbds.model.UploadFileResponseWrapper;
import id.mandiri.nbds.services.UploadFileI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
 
@Service
public class UploadFileImpl implements UploadFileI {
 
    private static final Log logger = LogFactory.getLog(UploadFileImpl.class);

    /**
     * 
     * This method includes the business logic for the API implementation
     *
     */
    @Override
    public UploadFileResponseWrapper execute(UploadFileP requestParams){
        //TODO
        return new UploadFileResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
