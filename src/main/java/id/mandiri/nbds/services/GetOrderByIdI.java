package id.mandiri.nbds.services;

import id.mandiri.nbds.model.GetOrderByIdP;
import id.mandiri.nbds.model.GetOrderByIdResponseWrapper;

public interface GetOrderByIdI {

    public GetOrderByIdResponseWrapper execute(GetOrderByIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
