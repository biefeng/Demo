package com.biefeng.demo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@Scope("prototype")
@RequestMapping("test")
public class TestPageController extends BaseController{

    @RequestMapping("displayByPage")
    @ResponseBody
    public Map<String,Object> displayByPage(){

        return resultMap;
    }
}
