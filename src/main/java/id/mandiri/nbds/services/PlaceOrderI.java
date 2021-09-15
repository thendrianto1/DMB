package id.mandiri.nbds.services;

import id.mandiri.nbds.model.PlaceOrderP;
import id.mandiri.nbds.model.PlaceOrderResponseWrapper;

public interface PlaceOrderI {

    public PlaceOrderResponseWrapper execute(PlaceOrderP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
