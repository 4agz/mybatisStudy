package com.dao;

import com.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student")
    public List<Student> getStudent();

}
