package com.biefeng.demo.controller;

import com.biefeng.demo.service.TestJsonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
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
    public ModelAndView listAllUser() {
        Map<String, Object> map = new HashMap<>();
        map = service.listAllUser((DEFAULT_PAGE_NO - 1) * DEFAULT_PAGE_SIZE, DEFAULT_PAGE_SIZE);
        ModelAndView modelAndView = new ModelAndView("/pages/user/listUser");
        modelAndView.addObject("result", map);
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(long id) {
        Map<String ,Object> map = new HashMap<>();
        map.put("id",id);
        return redirect("/Demo/pages/user/editUser.jsp",new Map[]{map});
       /* ModelAndView view = new ModelAndView("/pages/user/editUser");
        view.addObject("id",id);
        return view;*/
    }
}
