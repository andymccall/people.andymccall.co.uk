package uk.co.andymccall.people.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import uk.co.andymccall.people.model.Town;
import uk.co.andymccall.people.repository.TownRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * The TownServiceImplTest class is a test class that
 * tests the TownServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-02
 */
public class TownServiceImplTest {

    @Mock
    TownRepository mockTownRepository;

    @InjectMocks
    TownService townServiceUnderTest = new TownServiceImpl();

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        Town testTown = new Town(1,"Blackpool");
        Town testTown2 = new Town (2, "Preston");
        List<Town> testTownList = new ArrayList();
        testTownList.add(testTown);
        testTownList.add(testTown2);

        when(mockTownRepository.findDistinctByTownIdEquals(1)).thenReturn(testTown);
        when(mockTownRepository.findDistinctByTownNameEquals("Blackpool")).thenReturn(testTown);
        when(mockTownRepository.findAll()).thenReturn(testTownList);
    }

    @Test
    public void findDistinctByTownIdEquals() throws Exception {
        Assert.assertEquals("TownServiceImpl.findDistinctByTownIdEquals() has failed",
                1, townServiceUnderTest.findDistinctByTownIdEquals(1).getTownId());
    }

    @Test
    public void findDistinctByTownNameEquals() throws Exception {
        Assert.assertEquals("TownServiceImpl.findDistinctByTownNameEquals() has failed",
                "Blackpool", townServiceUnderTest.findDistinctByTownNameEquals("Blackpool").getTownName());
    }

    @Test
    public void TownServiceImpl_findAll_Passes() throws Exception {
        Assert.assertEquals("TownServiceImpl.findAll() has failed!",2, townServiceUnderTest.findAll().size() );
    }

}