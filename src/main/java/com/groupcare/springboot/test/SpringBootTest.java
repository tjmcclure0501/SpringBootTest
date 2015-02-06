/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupcare.springboot.test;

import org.springframework.stereotype.Service;

/**
 *
 * @author timmcclure
 */
@Service("springBootTest")
public class SpringBootTest {
    
    public SpringBootTest()
    {
        System.out.println("Constructor called");
    }
    
    public void fakeMethod()
    {
        System.out.println("Fake method called");
    }
}
