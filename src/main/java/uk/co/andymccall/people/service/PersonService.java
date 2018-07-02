package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.Person;

import java.util.List;

/**
 * The PersonService interface
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public interface PersonService {
    public void savePerson(Person person);
    public Person findDistinctByPersonIdEquals(Long personId);
    public List<Person> findAll();

}
