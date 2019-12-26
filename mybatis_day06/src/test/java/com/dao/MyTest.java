package com.dao;

import com.pojo.Student;
import com.pojo.Teacher;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
@SuppressWarnings("all")
public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper=sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher=mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> list=mapper.getStudent();

        for(Student student:list)
            System.out.println(student);

        sqlSession.close();
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);

        List<Student> students=mapper.getStudent2();
        for(Student student:students)
            System.out.println("学生名："+
                    student.getName()+"\t老师:"+
                    student.getTeacher().getName());

        sqlSession.close();
    }

}
