package uk.co.andymccall.people.model;

import org.apache.tomcat.jni.Local;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.Assert.*;

public class EmailAddressTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void EmailAddress_DefaultConstructor_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();

        Assert.assertNull("EmailAddress() failed as emailAddress contains data!",emailAddressUnderTest.getEmailAddress());
        Assert.assertNull("EmailAddress() failed as emailAddressId contains data!", emailAddressUnderTest.getEmailAddressId());
        Assert.assertNull("EmailAddress() failed as contactType contains data!",emailAddressUnderTest.getContactType());
        Assert.assertNotNull("EmailAddress() failed as verificationKey not present!", emailAddressUnderTest.getVerificationKey());
        Assert.assertNull("EmailAddress() failed as verificationDate contains data!", emailAddressUnderTest.getVerificationDate());
        Assert.assertFalse("EmailAddress() failed as verified is true!", emailAddressUnderTest.getVerified());

    }

    @Test
    public void EmailAddress_Constructor_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress("mailme@andymccall.co.uk", ContactType.PRIMARY);

        Assert.assertEquals("EmailAddress() failed as emailAddress contains incorrect data!","mailme@andymccall.co.uk", emailAddressUnderTest.getEmailAddress());
        Assert.assertNull("EmailAddress() failed as emailAddressId contains data!", emailAddressUnderTest.getEmailAddressId());
        Assert.assertEquals("EmailAddress() failed as contactType contains incorrect data!", ContactType.PRIMARY, emailAddressUnderTest.getContactType());
        Assert.assertNotNull("EmailAddress() failed as verificationKey not present!", emailAddressUnderTest.getVerificationKey());
        Assert.assertNull("EmailAddress() failed as verificationDate contains data!", emailAddressUnderTest.getVerificationDate());
        Assert.assertFalse("EmailAddress() failed as verified is true!", emailAddressUnderTest.getVerified());

    }

    @Test
    public void EmailAddress_setgetEmailAddress_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        emailAddressUnderTest.setEmailAddress("mailme@andymccall.co.uk");

        Assert.assertEquals("EmailAddress() failed as emailAddress contains incorrect data!","mailme@andymccall.co.uk", emailAddressUnderTest.getEmailAddress());

    }

    @Test
    public void EmailAddress_setgetEmailAddressId_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        emailAddressUnderTest.setEmailAddressId(99L);

        Assert.assertEquals("EmailAddress() failed as emailAddressId contains incorrect data!", 99L, (long)emailAddressUnderTest.getEmailAddressId());

    }

    @Test
    public void EmailAddress_setgetContactType_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        emailAddressUnderTest.setContactType(ContactType.PRIMARY);

        Assert.assertEquals("EmailAddress() failed as contactType contains incorrect data!", ContactType.PRIMARY, emailAddressUnderTest.getContactType());

    }

    @Test
    public void EmailAddress_setgetVerificationKey_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        UUID uuid = UUID.randomUUID();
        emailAddressUnderTest.setVerificationKey(uuid);

        Assert.assertEquals("EmailAddress() failed as UUID contains incorrect data!", uuid, emailAddressUnderTest.getVerificationKey());

    }

    @Test
    public void EmailAddress_setgetVerificationDate_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        LocalDate localDate = LocalDate.now();
        emailAddressUnderTest.setVerificationDate(localDate);

        Assert.assertEquals("EmailAddress() failed as verificationDate contains incorrect data!", localDate, emailAddressUnderTest.getVerificationDate());

    }

    @Test
    public void EmailAddress_setgetIsVerified_Passes() {

        EmailAddress emailAddressUnderTest = new EmailAddress();
        emailAddressUnderTest.setVerified(true);

        Assert.assertTrue("EmailAddress() failed as isVerified contains incorrect data!", emailAddressUnderTest.getVerified());
    }

}