package com.jnshu.service;

import com.jnshu.dao.UserDao;
import com.jnshu.model.user;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



/**
 * Created by 56929 on 2017/5/6.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public user select(long id){
        return userDao.select(id);
    }



    public user selectToUsername(String stu_name){
        return  userDao.selectToUsername(stu_name);
    }
    @Override
    public boolean verification(String stu_name, String stu_pwd) {

        if(userDao.verification(stu_name,stu_pwd)==null){
            return false;
        }
        return true;
    }

    public int insert(String stu_name, String stu_pwd) {
        return userDao.insert(stu_name, stu_pwd);
    }
    }

