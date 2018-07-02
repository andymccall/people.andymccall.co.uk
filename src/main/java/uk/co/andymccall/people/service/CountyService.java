package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.County;

import java.util.List;

/**
 * The CountyService interface
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */

public interface CountyService {

    public County findDistinctByCountyIdEquals(int countyId);
    public County findDistinctByCountyNameEquals(String countyName);
    public List<County> findAll();

}
