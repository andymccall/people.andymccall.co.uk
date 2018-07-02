package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.County;
import uk.co.andymccall.people.repository.CountyRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The CountyServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-04-12
 */

@Service("countyService")
@Transactional
public class CountyServiceImpl implements CountyService {

    @Autowired
    CountyRepository countyRepository;

    public County findDistinctByCountyIdEquals(int countyId) {
        return countyRepository.findDistinctByCountyIdEquals(countyId);
    }

    public County findDistinctByCountyNameEquals(String countyName) {
        return countyRepository.findDistinctByCountyNameEquals(countyName);
    }

    public List<County> findAll(){
        return countyRepository.findAll();
    }

}
