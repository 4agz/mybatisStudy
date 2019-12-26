package com.dao;

import com.pojo.User;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    //第一个测试
    @Test
    public void test(){
        //第一步获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        try{
            //方式一：getMapper
            UserMapper userDao=sqlSession.getMapper(UserMapper.class);
            List<User> userList=userDao.getUserList();

            for(User user:userList){
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }

}
