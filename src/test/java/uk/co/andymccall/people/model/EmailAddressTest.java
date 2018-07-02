package uk.co.andymccall.people.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailAddressTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void EmailAddress_DefaultConstructor_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();

        Assert.assertNull("EmailAdddress() failed as emailAddress contains data!",emailAddressUnderTest.getEmailAddress());
        Assert.assertNull("EmailAdddress() failed as emailAddressId contains data!", emailAddressUnderTest.getEmailAddressId());
        Assert.assertNull("EmailAdddress() failed as contactType contains data!",emailAddressUnderTest.getContactType());

    }

}