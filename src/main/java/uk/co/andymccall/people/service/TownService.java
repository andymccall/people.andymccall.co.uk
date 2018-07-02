package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.Town;

import java.util.List;

/**
 * The TownService interface
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

public interface TownService {
    public Town findDistinctByTownIdEquals(int townId);
    public Town findDistinctByTownNameEquals(String townName);
    public List<Town> findAll();
}
