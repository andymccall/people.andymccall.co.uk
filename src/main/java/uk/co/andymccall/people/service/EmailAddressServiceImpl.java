package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.EmailAddress;
import uk.co.andymccall.people.repository.EmailAddressRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The EmailAddressServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */

@Service("emailAddressService")
@Transactional
public class EmailAddressServiceImpl implements EmailAddressService {

    @Autowired
    EmailAddressRepository emailAddressRepository;

    public EmailAddress findDistinctByEmailAddressIdEquals(Long emailAddressId) {
        return emailAddressRepository.findDistinctByEmailAddressIdEquals(emailAddressId);
    }

    public EmailAddress findDistinctByEmailAddressEquals(String emailAddress) {
        return emailAddressRepository.findDistinctByEmailAddressEquals(emailAddress);
    }

    public List<EmailAddress> findAll(){
        return emailAddressRepository.findAll();
    }

}
