package com.biefeng.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    protected int pageNo;

    protected int pageSize;

    private static final int DEFAULT_PAGE_SIZE = 10;

    private static final int DEFAULT_PAGE_NO = 1;

    public static final String URL_404 = "/404.html";

    protected static final Logger logger = Logger.getLogger(BaseController.class);

    protected Map<String, Object> resultMap = new HashMap<String, Object>();

    public ModelAndView redirect(String redirectUrl, Map<String, Object>... parameters) {
        ModelAndView view = new ModelAndView(new RedirectView(redirectUrl));
        if (null != parameters && parameters.length > 0) {
            view.addAllObjects(parameters[0]);
        }
        return view;
    }

    public ModelAndView redirect404() {
        return new ModelAndView(new RedirectView(URL_404));
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
