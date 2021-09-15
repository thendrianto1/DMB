package id.mandiri.nbds.services;

import id.mandiri.nbds.model.GetPetByIdP;
import id.mandiri.nbds.model.GetPetByIdResponseWrapper;

public interface GetPetByIdI {

    public GetPetByIdResponseWrapper execute(GetPetByIdP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
