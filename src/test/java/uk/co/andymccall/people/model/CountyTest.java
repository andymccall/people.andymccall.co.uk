package uk.co.andymccall.people.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The CountyTest class is the class that
 * tests the County model
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-02
 */
public class CountyTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void County_DefaultConstructor_Passes() {

        County countyUnderTest = new County();

        Assert.assertNull("County() failed as title contains data!",countyUnderTest.getCountyName());
        Assert.assertEquals("Title() failed as titleId is not 0!",0, countyUnderTest.getCountyId());
        Assert.assertEquals("Title() failed as toString is not correct!","County{countyId=0, countyName='null'}", countyUnderTest.toString());
    }

    @Test
    public void County_Constructor_Passes() {

        County countyUnderTest = new County(99,"Lancashire");

        Assert.assertNull("County() failed as countyName is not Lancashire!",countyUnderTest.getCountyName());
        Assert.assertEquals("County() failed as titleId is not 99!", 99, countyUnderTest.getCountyId());
        Assert.assertEquals("County() failed as toString is not correct!", "County{countyId=0, countyName='null'}", countyUnderTest.toString());
    }

    @Test
    public void County_setgetCountyName_Passes() {

        County countyUnderTest = new County();
        countyUnderTest.setCountyName("Lancashire");

        Assert.assertEquals("County.setgetCountyName() failed as countyName is not Lancashire!","Lancashire", countyUnderTest.getCountyName());

    }

    @Test
    public void County_setgetCountyId_Passes() {

        County countyUnderTest = new County();
        countyUnderTest.setCountyId(99);

        Assert.assertEquals("County.setgetCountyId() failed as countyId is not 99!","Lancashire", countyUnderTest.getCountyName());

    }

}