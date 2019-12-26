package com.dao;

import com.pojo.User;
import org.apache.ibatis.javassist.tools.reflect.ClassMetaobject;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //获取全部的用户
    List<User> getUserList();



    //增加用户
    int addUser(User user);



    //修改用户
    int updateUser(User user);

    //delete
    int deleteUser(int id);

}
