package uk.co.andymccall.people.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The TownTest class is the class that
 * tests the Town model
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-02
 */
public class TownTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void Town_DefaultConstructor_Passes() {

        Town townUnderTest = new Town();

        Assert.assertNull("Town() failed as townName contains data!",townUnderTest.getTownName());
        Assert.assertEquals("Town() failed as townId is not 0!",0, townUnderTest.getTownId());
        Assert.assertEquals("Town() failed as toString is not correct!","Town{townId=0, townName='null'}", townUnderTest.toString());
    }

    @Test
    public void Town_Constructor_Passes() {

        Town townUnderTest = new Town(99,"Blackpool");

        Assert.assertEquals("Town() failed as townName is not Blackpool!","Blackpool",townUnderTest.getTownName());
        Assert.assertEquals("Town() failed as townId is not 99!", 99, townUnderTest.getTownId());
        Assert.assertEquals("Town() failed as toString is not correct!", "Town{townId=99, townName='Blackpool'}", townUnderTest.toString());
    }

    @Test
    public void Town_setgetTownName_Passes() {

        Town townUnderTest = new Town();
        townUnderTest.setTownName("Blackpool");

        Assert.assertEquals("Town.setgetTownName() failed as townName is not Blackpool!","Blackpool", townUnderTest.getTownName());

    }

    @Test
    public void Town_setgetTownId_Passes() {

        Town townUnderTest = new Town();
        townUnderTest.setTownId(99);

        Assert.assertEquals("Town.setgetTownId() failed as townId is not 99!",99, townUnderTest.getTownId());

    }


}