package com.biefeng.demo.service;

import com.biefeng.demo.dao.TestJsonDao;
import com.biefeng.demo.moudles.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestJsonService {

    @Autowired
    TestJsonDao dao;

    @Transactional
    public String getInfo(long id) {

        User user = dao.getInfo(id);

        return user.getNickName();
    }

    public Map<String, Object> listAllUser(int offSet, int limit) {
        List<User> list = dao.getAll(offSet, limit);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("users", list);
        return resultMap;
    }
}
