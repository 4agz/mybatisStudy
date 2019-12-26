package com.dao;

import com.dao.StudentMapper;
import com.dao.TeacherMapper;
import com.pojo.Student;
import com.pojo.Teacher;
import com.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    /**
     * 1.关联-association【多对一
     * 2.集合-collection【一对多
     * 3.JavaType & ofType
     *  1.JavaType用来指定实体类中属性的类型
     *  2.ofType用来指定映射到List或者集合中的pojo类型，泛型中是约束类型
     *  注意点：
     *      *保证SQL的可读性，尽量保证通俗易懂
     *      *注意一对多和多对一种，属性名和字段的问题
     * @param args
     */

    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent();
        for (Student student:students)
            System.out.println(student);

        sqlSession.close();
    }

    @Test
    public void getTeacher1(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher=mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    //一对多查询，按查询嵌套处理
    @Test
    public void getTeacher2(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher=mapper.getTeacher2(1);
        System.out.println(teacher);
        sqlSession.close();
    }

}
