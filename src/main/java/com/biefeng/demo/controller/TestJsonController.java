package com.biefeng.demo.controller;

import com.biefeng.demo.service.TestJsonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("/test")
@Controller
public class TestJsonController extends BaseController {

    @Resource
    TestJsonService service;

    @RequestMapping("/testJson")
    public @ResponseBody
    String getUserInfo() {

        String result = service.getInfo(11);
        return result;
    }

    @RequestMapping("/listAllUer")
    @ResponseBody
    public Map<String, Object> listAllUser() {

        return resultMap;
    }
}
