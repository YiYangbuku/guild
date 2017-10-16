package com.guild.api.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author yangyi
 * @date 16/10/2017 2:39 PM
 */
@Component
public class CustomerHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("reachable", "true").build();
    }
}
