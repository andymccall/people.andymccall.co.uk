package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.Title;
import uk.co.andymccall.people.repository.TitleRepository;

import javax.transaction.Transactional;

/**
 * The TitleServiceImpl class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-06-25
 */

@Service("titleService")
@Transactional
public class TitleServiceImpl implements TitleService {

    @Autowired
    TitleRepository titleRepository;

    @Override
    public Title findDistinctByTitleIdEquals(int titleId) {
        return titleRepository.findDistinctByTitleIdEquals(titleId);
    }

    @Override
    public Title findDistinctByTitleEquals(String title) {
        return titleRepository.findDistinctByTitleEquals(title);
    }
}
