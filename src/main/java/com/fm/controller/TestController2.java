package com.fm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 *@description:
 *@author: klw
 *@time: 2020-08-08 10:59
 *
 */
@RestController
@RequestMapping("/aa")
public class TestController2 {

    @RequestMapping("/hello")
    public String hello(){

        return "success";
    }
}

