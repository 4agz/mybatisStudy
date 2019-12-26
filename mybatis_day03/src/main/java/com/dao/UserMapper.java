package com.dao;

import com.pojo.User;
import org.apache.ibatis.javassist.tools.reflect.ClassMetaobject;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //获取全部的用户
    List<User> getUserList();

    List<User> getUserByLimit(Map<String,Integer> map);

}
