package id.mandiri.nbds.services;

import id.mandiri.nbds.model.CreateUsersWithListInputP;
import id.mandiri.nbds.model.CreateUsersWithListInputResponseWrapper;

public interface CreateUsersWithListInputI {

    public CreateUsersWithListInputResponseWrapper execute(CreateUsersWithListInputP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
