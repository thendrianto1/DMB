package id.mandiri.nbds.services;

import id.mandiri.nbds.model.DeleteUserP;
import id.mandiri.nbds.model.DeleteUserResponseWrapper;

public interface DeleteUserI {

    public DeleteUserResponseWrapper execute(DeleteUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
