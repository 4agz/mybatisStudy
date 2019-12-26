package com.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    //多个学生可以是同一个老师，即多对一
    //学生关联一个老师
    private Teacher teacher;
}
