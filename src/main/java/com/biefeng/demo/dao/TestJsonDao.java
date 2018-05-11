package com.biefeng.demo.dao;

import com.biefeng.demo.moudles.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TestJsonDao {

    User getInfo(long id);

    List<User> getAll(@Param("offset") int offSet, @Param("limit") int limit);

   // void delete(long id);
}
