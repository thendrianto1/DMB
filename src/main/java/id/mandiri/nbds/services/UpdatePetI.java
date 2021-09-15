package id.mandiri.nbds.services;

import id.mandiri.nbds.model.UpdatePetP;
import id.mandiri.nbds.model.UpdatePetResponseWrapper;

public interface UpdatePetI {

    public UpdatePetResponseWrapper execute(UpdatePetP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
