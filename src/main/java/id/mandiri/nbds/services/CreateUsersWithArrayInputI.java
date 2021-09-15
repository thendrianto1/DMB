package id.mandiri.nbds.services;

import id.mandiri.nbds.model.CreateUsersWithArrayInputP;
import id.mandiri.nbds.model.CreateUsersWithArrayInputResponseWrapper;

public interface CreateUsersWithArrayInputI {

    public CreateUsersWithArrayInputResponseWrapper execute(CreateUsersWithArrayInputP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
