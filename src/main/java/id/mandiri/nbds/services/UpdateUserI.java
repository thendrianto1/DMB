package id.mandiri.nbds.services;

import id.mandiri.nbds.model.UpdateUserP;
import id.mandiri.nbds.model.UpdateUserResponseWrapper;

public interface UpdateUserI {

    public UpdateUserResponseWrapper execute(UpdateUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
