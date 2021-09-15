package id.mandiri.nbds.services;

import id.mandiri.nbds.model.AddPetP;
import id.mandiri.nbds.model.AddPetResponseWrapper;

public interface AddPetI {

    public AddPetResponseWrapper execute(AddPetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
