package com.guild.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyi
 * @date 11/10/2017 11:06 AM
 */
@RestController
public class CustomerController {

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String getCustomer() {
        return "Id: ID1234, Name: James";
    }

}
