package com.guild.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyi
 * @date 11/10/2017 11:06 AM
 */
@RestController
public class LogisticsController {

    @RequestMapping(value = "/logistics", method = RequestMethod.GET)
    public String getLogistics() {
        return "Logistics: sf-express";
    }

}
