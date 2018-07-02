package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.Title;

/**
 * The TitleService interface
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2018-06-25
 */

public interface TitleService {
    public Title findDistinctByTitleIdEquals(int titleId);
    public Title findDistinctByTitleEquals(String title);
}
