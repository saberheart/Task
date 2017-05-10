package com.jnshu.service;

import com.jnshu.model.user;

/**
 * Created by 56929 on 2017/5/6.
 */
public interface UserService {
     user select(long id);
     boolean verification(String stu_name,String stu_pwd);
     int insert(String stu_name,  String stu_pwd);
     user selectToUsername(String stu_name);
}
