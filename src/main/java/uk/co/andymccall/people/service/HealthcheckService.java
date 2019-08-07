package uk.co.andymccall.people.service;

import uk.co.andymccall.people.model.Healthcheck;

/**
 * The HealthcheckService interface
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2018-07-03
 */

public interface HealthcheckService {

    public void saveHealthcheck(Healthcheck healthcheck);
    public boolean isHealthy();

}
