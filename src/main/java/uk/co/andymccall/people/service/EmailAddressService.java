package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.EmailAddress;

import java.util.List;

/**
 * The EmailAddressService interface
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */


public interface EmailAddressService {

    public EmailAddress findDistinctByEmailAddressIdEquals(Long emailId);
    public EmailAddress findDistinctByEmailAddressEquals(String emailAddress);
    public List<EmailAddress> findAll();

}
