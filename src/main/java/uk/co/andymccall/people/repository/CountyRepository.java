package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.County;

import java.util.List;

/**
 * The CountyRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */

public interface CountyRepository extends CrudRepository<County, Long> {
    public County findDistinctByCountyIdEquals(int countyId);
    public County findDistinctByCountyNameEquals(String countyName);
    public List<County> findAll();
}
