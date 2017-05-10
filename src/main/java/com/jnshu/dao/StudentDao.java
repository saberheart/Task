package com.jnshu.dao;

import com.jnshu.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */
@Component
@Repository
public interface StudentDao {
    //登陆方法
    Student Login(@Param("stu_name")String stu_name, @Param("stu_pwd")String stu_pwd);
    //通过ID查找学生信息
//    public Student selectStudentById(@Param("id")int id);
    //查看所有学生信息
    List<Student> selectAllStudent();
    //添加学生
    int addStudent(Student stu);
    //通过id删除学生
    void  deleteStudentById(@Param("id")int id);
    //修改学生信息
    void updateStudentById(@Param("Student")Student stu);
    public Student verification(@Param("stu_name") String stu_name, @Param("stu_pwd") String stu_pwd);

    Student Login(@Param("stu_name")String stu_name);
    long insert(@Param("stu_name")String stu_name,@Param("stu_pwd")String stu_pwd);
    Student select(long id);
}
