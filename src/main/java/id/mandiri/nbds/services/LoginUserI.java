package id.mandiri.nbds.services;

import id.mandiri.nbds.model.LoginUserP;
import id.mandiri.nbds.model.LoginUserResponseWrapper;

public interface LoginUserI {

    public LoginUserResponseWrapper execute(LoginUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
