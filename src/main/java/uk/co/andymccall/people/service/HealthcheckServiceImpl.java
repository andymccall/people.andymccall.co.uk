package uk.co.andymccall.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Service;
import uk.co.andymccall.people.model.Healthcheck;
import uk.co.andymccall.people.repository.HealthcheckRepository;

import javax.transaction.Transactional;

@Service("pingService")
@Transactional
public class HealthcheckServiceImpl implements HealthcheckService {

    @Autowired
    HealthcheckRepository healthcheckRepository;

    @Override
    public void saveHealthcheck(Healthcheck healthcheck) {
        healthcheckRepository.save(healthcheck);
    }

    @Override
    public boolean isHealthy() {
        return (healthcheckRepository.findDistinctByHealthcheckIdEquals(1L).getHealthcheckId() == 1L);
    }

}

