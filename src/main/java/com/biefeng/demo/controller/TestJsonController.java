package com.biefeng.demo.controller;

import com.biefeng.demo.service.TestJsonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("/test")
@Controller
public class TestJsonController {

    @Resource
    TestJsonService service;

    @RequestMapping("/testJson")
    public @ResponseBody
    String getUserInfo() {

        String result = service.getInfo(11);
        return result;
    }
}
