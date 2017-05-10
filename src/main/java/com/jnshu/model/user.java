package com.jnshu.model;

/**
 * Created by 56929 on 2017/5/6.
 */
public class user {
    private long id;
    private String stu_name;
    private String stu_pwd;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_pwd='" + stu_pwd + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_pwd() {
        return stu_pwd;
    }

    public void setStu_pwd(String stu_pwd) {
        this.stu_pwd = stu_pwd;
    }
}
