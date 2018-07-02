package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.Person;

import java.util.List;

/**
 * The PersonRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public interface PersonRepository extends CrudRepository<Person, Long> {
    public Person findDistinctByPersonIdEquals(Long personId);
    public List<Person> findAll();
}
