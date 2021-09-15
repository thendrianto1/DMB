package id.mandiri.nbds.services;

import id.mandiri.nbds.model.GetUserByNameP;
import id.mandiri.nbds.model.GetUserByNameResponseWrapper;

public interface GetUserByNameI {

    public GetUserByNameResponseWrapper execute(GetUserByNameP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
