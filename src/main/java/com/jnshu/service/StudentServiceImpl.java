package com.jnshu.service;

import com.jnshu.dao.StudentDao;
import com.jnshu.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao stuDao;


    public Student Login(String stu_name, String stu_pwd) {
        return  stuDao.Login(stu_name,stu_pwd);
    }

    public List<Student> getAllStudent() {
        return stuDao.selectAllStudent();
    }

    public int addStudent(Student stu) {
        return stuDao.addStudent(stu);
    }

    public void deleteStudentById(int id) {
        stuDao.deleteStudentById(id);
    }

    public void updateStudentById(Student stu) {
        stuDao.updateStudentById(stu);
    }

    public boolean verification(String stu_name, String stu_pwd) {
        if (stuDao.verification(stu_name,stu_pwd)==null){
            return false;
        }
        return true;
    }

    public Student Login(String stu_name) {
        return stuDao.Login(stu_name);
    }

    public long insert(String stu_name, String stu_pwd) {
        return stuDao.insert(stu_name,stu_pwd);
    }

    public Student select(long id) {
        return stuDao.select(id);
    }
}



