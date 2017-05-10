package com.jnshu.service;

import com.jnshu.model.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */
public interface StudentService {

    Student Login(String stu_name, String stu_pwd);

    List<Student> getAllStudent();

    int addStudent(Student stu);

    void deleteStudentById(int  id);

    void updateStudentById(Student stu);
    public boolean verification(String stu_name,String stu_pwd);

    Student Login(String stu_name);
    long insert(String stu_name, String stu_pwd);
    public Student select(long id);
}
