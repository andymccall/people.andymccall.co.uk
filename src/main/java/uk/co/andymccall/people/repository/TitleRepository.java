package uk.co.andymccall.people.repository;

import org.springframework.data.repository.CrudRepository;
import uk.co.andymccall.people.model.Title;

/**
 * The TitleRepository class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-26
 */

public interface TitleRepository extends CrudRepository<Title, Long> {
    public Title findDistinctByTitleIdEquals(int titleId);
    public Title findDistinctByTitleEquals(String title);
}
