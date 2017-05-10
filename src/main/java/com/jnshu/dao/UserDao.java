package com.jnshu.dao;

import com.jnshu.model.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by 56929 on 2017/5/6.
 */
@Component
@Repository
public interface UserDao {
    public user select(long id);
    public user selectToUsername(String stu_name);
    public int insert(@Param("stu_name") String stu_name, @Param("stu_pwd") String stu_pwd);
    public user verification(@Param("stu_name") String stu_name, @Param("stu_pwd") String stu_pwd);


}
