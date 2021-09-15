package id.mandiri.nbds.services;

import id.mandiri.nbds.model.LogoutUserP;
import id.mandiri.nbds.model.LogoutUserResponseWrapper;

public interface LogoutUserI {

    public LogoutUserResponseWrapper execute(LogoutUserP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
