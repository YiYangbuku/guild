package com.guild.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangyi
 * @date 16/10/2017 11:21 AM
 */
@Service
public class LogisticsService {
    private RestTemplate restTemplate;

    @Value("${service.logistics.baseurl}")
    private String baseUrl;
    private String suffix = "logistics";

    public LogisticsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String getLogistics() {
        return restTemplate.getForEntity(baseUrl + suffix, String.class).getBody();
    }
}
