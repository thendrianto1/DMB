package id.mandiri.nbds.services;

import id.mandiri.nbds.model.CreateUserP;
import id.mandiri.nbds.model.CreateUserResponseWrapper;

public interface CreateUserI {

    public CreateUserResponseWrapper execute(CreateUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
