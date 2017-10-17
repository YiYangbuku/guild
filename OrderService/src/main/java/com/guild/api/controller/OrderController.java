package com.guild.api.controller;

import com.guild.api.service.CustomerService;
import com.guild.api.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyi
 * @date 16/10/2017 11:07 AM
 */
@RestController
public class OrderController extends BaseController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private LogisticsService logisticsService;


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getOrder() {
        return "Order id: XXX";
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET, headers = "api-version=2")
    public String getOrderV2() {
        return "V2: order id: XXX" + customerService.getCustomer() + ", " + logisticsService.getLogistics();
    }
}
