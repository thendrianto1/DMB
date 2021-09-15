package id.mandiri.nbds.services;

import id.mandiri.nbds.model.UploadFileP;
import id.mandiri.nbds.model.UploadFileResponseWrapper;

public interface UploadFileI {

    public UploadFileResponseWrapper execute(UploadFileP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
