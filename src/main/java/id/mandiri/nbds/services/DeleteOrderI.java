package id.mandiri.nbds.services;

import id.mandiri.nbds.model.DeleteOrderP;
import id.mandiri.nbds.model.DeleteOrderResponseWrapper;

public interface DeleteOrderI {

    public DeleteOrderResponseWrapper execute(DeleteOrderP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
