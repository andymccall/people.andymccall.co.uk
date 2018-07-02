package uk.co.andymccall.people.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.andymccall.people.model.County;
import uk.co.andymccall.people.repository.CountyRepository;

import static org.mockito.Mockito.when;

/**
 * The CountyServiceImplTest class is a test class that
 * tests the CountyServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-02
 */
public class CountyServiceImplTest {

    @Mock
    CountyRepository mockCountyRepository;

    @InjectMocks
    CountyService countyServiceUnderTest = new CountyServiceImpl();

    /**
     * Sets up objects and mocks external dependencies needed
     * for the tests.
     */
    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        County testCounty = new County(1,"Lancashire");

        when(mockCountyRepository.findDistinctByCountyNameEquals("Lancashire")).thenReturn(testCounty);
        when(mockCountyRepository.findDistinctByCountyIdEquals(1)).thenReturn(testCounty);

    }

    /**
     * Tests CountyServiceImpl.findDistinctByCountyIdEquals()
     */
    @Test
    public void findDistinctByCountyIdEquals_CountyFound_Passes() throws Exception {
        Assert.assertEquals("CountyServiceImpl.findDistinctByCountyIdEquals failed",1,
                countyServiceUnderTest.findDistinctByCountyIdEquals(1).getCountyId());
    }

    /**
     * Tests CountyServiceImpl.findDistinctByCountyNameEquals()
     */
    @Test
    public void findDistinctByCountyNameEquals_CountyFound_Passes() throws Exception {
        Assert.assertEquals("CountyServiceImpl.findDistinctByCountyNameEquals failed","Lancashire",
                countyServiceUnderTest.findDistinctByCountyNameEquals("Lancashire").getCountyName());
    }

}