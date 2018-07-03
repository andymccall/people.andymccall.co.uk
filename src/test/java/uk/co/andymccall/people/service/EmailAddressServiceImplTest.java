package uk.co.andymccall.people.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.andymccall.people.model.ContactType;
import uk.co.andymccall.people.model.EmailAddress;
import uk.co.andymccall.people.repository.EmailAddressRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * The EmailAddressServiceImplTest class is a test class that
 * tests the EmailAddressServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-03
 */

public class EmailAddressServiceImplTest {

    @Mock
    EmailAddressRepository mockEmailAddressRepository;

    @InjectMocks
    EmailAddressService emailAddressServiceUnderTest = new EmailAddressServiceImpl();

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        EmailAddress testEmailAddress1 = new EmailAddress("test1.email@test.com", ContactType.PRIMARY);
        testEmailAddress1.setEmailAddressId(1L);

        EmailAddress testEmailAddress2 = new EmailAddress("test2.email@test.com", ContactType.PRIMARY);
        testEmailAddress2.setEmailAddressId(2L);

        List<EmailAddress> emailAddressList = new ArrayList();
        emailAddressList.add(testEmailAddress1);
        emailAddressList.add(testEmailAddress2);

        when(mockEmailAddressRepository.findDistinctByEmailAddressIdEquals(1L)).thenReturn(testEmailAddress1);
        when(mockEmailAddressRepository.findDistinctByEmailAddressEquals("test2.email@test.com")).thenReturn(testEmailAddress2);
        when(mockEmailAddressRepository.findAll()).thenReturn(emailAddressList);

    }

    @Test
    public void EmailAddressService_findDistinctByEmaulAddressIdEquals_Passes() throws Exception {
        Assert.assertEquals("EmailAddressService.findDistinctByEmailAddressIdEquals has failed!", 1, (long)emailAddressServiceUnderTest.findDistinctByEmailAddressIdEquals(1L).getEmailAddressId());
    }

    @Test
    public void EmailAddressService_findDistinctByEmailAddressEquals_Passes() throws Exception {
        Assert.assertEquals("EmailAddressService.findDistinctByEmailAddressEquals has failed!", "test2.email@test.com", emailAddressServiceUnderTest.findDistinctByEmailAddressEquals("test2.email@test.com").getEmailAddress());
    }

    @Test
    public void EmailAddressService_findAll_Passes() throws Exception {
        Assert.assertEquals("EmailAddressService.findAll() has failed!", 2, emailAddressServiceUnderTest.findAll().size());
    }

}