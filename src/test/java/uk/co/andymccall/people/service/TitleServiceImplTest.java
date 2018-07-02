package uk.co.andymccall.people.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.andymccall.people.model.Title;
import uk.co.andymccall.people.repository.TitleRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * The TitleServiceImplTest class is a test class that
 * tests the TitleServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-10-18
 */
public class TitleServiceImplTest {

    @Mock
    TitleRepository mockTitleServiceRepository;

    @InjectMocks
    TitleService titleServiceImplUnderTest = new TitleServiceImpl();

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        Title testTitle = new Title(1,"Mr");

        when(mockTitleServiceRepository.findDistinctByTitleEquals("Mr")).thenReturn(testTitle);
        when(mockTitleServiceRepository.findDistinctByTitleIdEquals(1)).thenReturn(testTitle);

    }

    @Test
    public void findDistinctByTitleIdEquals_TitleFound_Passes() throws Exception {
        Assert.assertEquals("TitleServiceImpl.findDistinctByTitleIdEquals failed",1, titleServiceImplUnderTest.findDistinctByTitleIdEquals(1).getTitleId());
    }

    @Test
    public void findDistinctByTitleEquals_TitleFound_Passes() throws Exception {
        Assert.assertEquals("TitleServiceImpl.findDistinctByTitleEquals failed", "Mr", titleServiceImplUnderTest.findDistinctByTitleEquals("Mr").getTitle());
    }

}