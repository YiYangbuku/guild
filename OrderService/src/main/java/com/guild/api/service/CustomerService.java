package com.guild.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangyi
 * @date 16/10/2017 11:21 AM
 */
@Service
public class CustomerService {

    private RestTemplate restTemplate;

    @Value("${service.customer.baseurl}")
    private String baseUrl;
    private String suffix = "customer";

    public CustomerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCustomer() {
        return restTemplate.getForEntity(baseUrl + suffix, String.class).getBody();
    }
}
