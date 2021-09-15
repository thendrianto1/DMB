package id.mandiri.nbds.services;

import id.mandiri.nbds.model.FindPetsByTagsP;
import id.mandiri.nbds.model.FindPetsByTagsResponseWrapper;

public interface FindPetsByTagsI {

    public FindPetsByTagsResponseWrapper execute(FindPetsByTagsP requestParams);

    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}
