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

    //第一步，导包
    static Logger logger=Logger.getLogger(UserDaoTest.class);

    //第一个测试
    @Test
    public void test(){
        //第一步获取SqlSession对象
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        try{
            //方式一：getMapper
            UserMapper userDao=sqlSession.getMapper(UserMapper.class);
            List<User> userList=userDao.getUserList();
            logger.info("info:进入了testLog4j");
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

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);

        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("startIndex",1);
        map.put("pageSize",3);
        List<User> userList=mapper.getUserByLimit(map);
        for(User user:userList)
            System.out.println(user);


        sqlSession.close();
    }

    @Test
    public void testLog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

}
