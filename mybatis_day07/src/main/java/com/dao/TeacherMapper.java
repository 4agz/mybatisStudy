package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //@Select("select * from teacher where id=#{id}")
    Teacher getTeacher(@Param("tid") int id);

    List<Teacher> getTeacher1();
    Teacher getTeacher2(@Param("tid") int id);
}
