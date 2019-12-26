package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.javassist.tools.reflect.ClassMetaobject;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from tbl_employee")
    List<User> getUsers();

    //方法存在多个参数，所有的参数前面必须加上@Param

    @Select("select * from tbl_employee where id =#{id}")
    User getUserById(@Param("id") int id);

    //插入一条数据
    @Insert("insert into tbl_employee(id,name,pwd) value (#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update tbl_employee set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from tbl_employee where id=#{id}")
    int detele(@Param("id") int id);



}

