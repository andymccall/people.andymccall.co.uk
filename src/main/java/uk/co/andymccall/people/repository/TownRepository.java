package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.Town;

import java.util.List;

/**
 * The TownRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public interface TownRepository extends CrudRepository<Town, Long> {
    public Town findDistinctByTownIdEquals(int townId);
    public Town findDistinctByTownNameEquals(String townName);
    public List<Town> findAll();
}