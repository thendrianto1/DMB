package id.mandiri.nbds.services;

import id.mandiri.nbds.model.FindPetsByStatusP;
import id.mandiri.nbds.model.FindPetsByStatusResponseWrapper;

public interface FindPetsByStatusI {

    public FindPetsByStatusResponseWrapper execute(FindPetsByStatusP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
