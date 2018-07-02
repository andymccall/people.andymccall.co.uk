package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.EmailAddress;

import java.util.List;

/**
 * The EmailAddressRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public interface EmailAddressRepository extends CrudRepository<EmailAddress, Long> {
    public EmailAddress findDistinctByEmailAddressIdEquals(Long emailAddressId);
    public EmailAddress findDistinctByEmailAddressEquals(String emailAddress);
    public List<EmailAddress> findAll();
}
