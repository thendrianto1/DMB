package id.mandiri.nbds.services;

import id.mandiri.nbds.model.GetInventoryP;
import id.mandiri.nbds.model.GetInventoryResponseWrapper;

public interface GetInventoryI {

    public GetInventoryResponseWrapper execute(GetInventoryP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
