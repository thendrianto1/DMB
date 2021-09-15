package id.mandiri.nbds.services;

import id.mandiri.nbds.model.DeletePetP;
import id.mandiri.nbds.model.DeletePetResponseWrapper;

public interface DeletePetI {

    public DeletePetResponseWrapper execute(DeletePetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
