package id.mandiri.nbds.services;

import id.mandiri.nbds.model.UpdatePetWithFormP;
import id.mandiri.nbds.model.UpdatePetWithFormResponseWrapper;

public interface UpdatePetWithFormI {

    public UpdatePetWithFormResponseWrapper execute(UpdatePetWithFormP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
