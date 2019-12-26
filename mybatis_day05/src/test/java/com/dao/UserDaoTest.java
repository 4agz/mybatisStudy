package com.dao;

import com.pojo.User;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        List<User> users=mapper.getUsers();

        for(User user:users)
            System.out.println(user);
        sqlSession.close();

    }
    @Test
    public void getUserById(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        User user= mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        mapper.detele(7);


        sqlSession.commit();
        sqlSession.close();
    }


    //更新
    //mapper.updateUser(new User(4,"王三","69584"));


}
