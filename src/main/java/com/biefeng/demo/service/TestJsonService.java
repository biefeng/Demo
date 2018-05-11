package com.biefeng.demo.service;

import com.biefeng.demo.dao.TestJsonDao;
import com.biefeng.demo.moudles.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestJsonService {

    @Autowired
    TestJsonDao dao;

    @Transactional
    public String getInfo(long id) {

        User user = dao.getInfo(id);

        return user.getNickName();
    }
}
