package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.Town;
import uk.co.andymccall.people.repository.TownRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * The TownServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */

@Service("townService")
@Transactional
public class TownServiceImpl implements TownService {

    @Autowired
    private TownRepository townRepository;

    public Town findDistinctByTownIdEquals(int townId) {
        return townRepository.findDistinctByTownIdEquals(townId);
    }

    public Town findDistinctByTownNameEquals(String townName) {
        return townRepository.findDistinctByTownNameEquals(townName);
    }

    public List<Town> findAll() {
        return townRepository.findAll();
    }

}

