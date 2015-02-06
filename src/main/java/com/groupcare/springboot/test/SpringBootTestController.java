/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupcare.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author timmcclure
 */
@Controller
@RequestMapping("/service")
public class SpringBootTestController {

    @Autowired
    private SpringBootTest springBootTest;

    public SpringBootTestController() {
        springBootTest.fakeMethod();
    }

    /**
     *
     * @return the get method that return the service info and statistics
     */
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String getServiceInfo() {
        return "";
    }
}
