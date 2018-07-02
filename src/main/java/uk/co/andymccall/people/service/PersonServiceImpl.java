package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.Person;
import uk.co.andymccall.people.repository.PersonRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The PersonServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-04-12
 */

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public Person findDistinctByPersonIdEquals(Long personId) {
        return personRepository.findDistinctByPersonIdEquals(personId);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }


}

