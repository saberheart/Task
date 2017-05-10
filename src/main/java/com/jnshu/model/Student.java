package com.jnshu.model;

/**
 * Created by Administrator on 2017/4/14.
 */
public class Student {
    private long id;
    private String stu_name;
    private String stu_pwd;
    private String stu_QQ;
    private String course;
    private String stu_date;
    private String school;
    private long stu_ID;
    private String daily_link;
    private String hope;
    private String yinjian;
    private String shenhe;
    private long create_at;
    private long update_at;
    private String phone;
    private String company;
    private String introduce;
    private String position;

    public long getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(int id) {
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

    public String getStu_QQ() {
        return stu_QQ;
    }

    public void setStu_QQ(String stu_QQ) {
        this.stu_QQ = stu_QQ;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStu_date() {
        return stu_date;
    }

    public void setStu_date(String stu_date) {
        this.stu_date = stu_date;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public long getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(long stu_ID) {
        this.stu_ID = stu_ID;
    }

    public String getDaily_link() {
        return daily_link;
    }

    public void setDaily_link(String daily_link) {
        this.daily_link = daily_link;
    }

    public String getHope() {
        return hope;
    }

    public void setHope(String hope) {
        this.hope = hope;
    }

    public String getYinjian() {
        return yinjian;
    }

    public void setYinjian(String yinjian) {
        this.yinjian = yinjian;
    }

    public String getShenhe() {
        return shenhe;
    }

    public void setShenhe(String shenhe) {
        this.shenhe = shenhe;
    }

    public long getCreate_at() {
        return create_at;
    }

    public void setCreate_at(long create_at) {
        this.create_at = create_at;
    }

    public long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(long update_at) {
        this.update_at = update_at;
    }


    public Student(int id, String stu_name, String stu_pwd, String stu_QQ, String course, String stu_date, String school, long stu_ID, String daily_link, String hope, String yinjian, String shenhe, long create_at, long update_at, String phone, String company, String introduce, String position) {
        this.id = id;
        this.stu_name = stu_name;
        this.stu_pwd = stu_pwd;
        this.stu_QQ = stu_QQ;
        this.course = course;
        this.stu_date = stu_date;
        this.school = school;
        this.stu_ID = stu_ID;
        this.daily_link = daily_link;
        this.hope = hope;
        this.yinjian = yinjian;
        this.shenhe = shenhe;
        this.create_at = create_at;
        this.update_at = update_at;
        this.phone = phone;
        this.company = company;
        this.introduce = introduce;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stu_name='" + stu_name + '\'' +
                ", stu_pwd='" + stu_pwd + '\'' +
                ", stu_QQ='" + stu_QQ + '\'' +
                ", course='" + course + '\'' +
                ", stu_date='" + stu_date + '\'' +
                ", school='" + school + '\'' +
                ", stu_ID=" + stu_ID +
                ", daily_link='" + daily_link + '\'' +
                ", hope='" + hope + '\'' +
                ", yinjian='" + yinjian + '\'' +
                ", shenhe='" + shenhe + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                ", phone='" + phone + '\'' +
                ", company='" + company + '\'' +
                ", introduce='" + introduce + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public Student() {
        super();
    }
}
