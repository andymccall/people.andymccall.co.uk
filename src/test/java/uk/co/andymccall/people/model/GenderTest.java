package uk.co.andymccall.people.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * The GenderTest class is a test class that
 * tests the values of the ENUM Gender.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-02
 */
public class GenderTest {

    @Test
    public void getDisplayName_IsUnknown_Passes() throws Exception {
        Assert.assertEquals(Gender.UNKNOWN.getDisplayName(),"U");
    }

    @Test
    public void getDisplayName_IsMale_Passes() throws Exception {
        Assert.assertEquals(Gender.MALE.getDisplayName(),"M");
    }

    @Test
    public void getDisplayName_IsFemale_Passes() throws Exception {
        Assert.assertEquals(Gender.FEMALE.getDisplayName(),"F");
    }

    @Test
    public void getDisplayName_IsWithheld_Passes() throws Exception {
        Assert.assertEquals(Gender.WITHHELD.getDisplayName(),"W");
    }

}