package uk.co.andymccall.people.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The TitleTest class is a test class
 * that tests Title class.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-01-28
 */
public class TitleTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void Title_DefaultConstructor_Passes() {

        Title titleUnderTest = new Title();

        Assert.assertNull("Title() failed as title contains data!",titleUnderTest.getTitle());
        Assert.assertEquals("Title() failed as titleId is not 0!", 0, titleUnderTest.getTitleId());
        Assert.assertEquals("Title() failed as toString is not correct!", "Title{titleId=0, title='null'}", titleUnderTest.toString());

    }

    @Test
    public void Title_Constructor_Passes() {

        Title titleUnderTest = new Title(99,"Mr.");

        Assert.assertEquals("Title() failed as title is not Mr.!","Mr.", titleUnderTest.getTitle());
        Assert.assertEquals("Title() failed as titleId is not 99!", 99, titleUnderTest.getTitleId());
        Assert.assertEquals("Title() failed as toString is not correct!", "Title{titleId=99, title='Mr.'}", titleUnderTest.toString());

    }

    @Test
    public void Title_setgetTitle_Passes() {

        Title titleUnderTest = new Title();
        titleUnderTest.setTitle("Mr.");

        Assert.assertEquals("Title() failed as title is not Mr.!","Mr.", titleUnderTest.getTitle());

    }

    @Test
    public void Title_setgetTitleId_Passes() {

        Title titleUnderTest = new Title();
        titleUnderTest.setTitleId(99);

        Assert.assertEquals("Title() failed as titleId is not 99!", 99, titleUnderTest.getTitleId());

    }

}