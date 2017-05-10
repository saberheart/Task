package com.jnshu.model;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Profession {
    private long id;
    private String direction;
    private String profession;
    private String introduce;
    private int difficult;
    private int threshold;
    private String cycle;
    private int need_num;
    private String money_low;
    private String money_mid;
    private String money_high;
    private int stu_num;
    private String tip;
    private String details;

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
        this.stu_num = stu_num;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getNeed_num() {
        return need_num;
    }

    public void setNeed_num(int need_num) {
        this.need_num = need_num;
    }

    public String getMoney_low() {
        return money_low;
    }

    public void setMoney_low(String money_low) {
        this.money_low = money_low;
    }

    public String getMoney_mid() {
        return money_mid;
    }

    public void setMoney_mid(String money_mid) {
        this.money_mid = money_mid;
    }

    public String getMoney_high() {
        return money_high;
    }

    public void setMoney_high(String money_high) {
        this.money_high = money_high;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }



    @Override
    public String toString() {
        return "Profession{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ",professsion='"+profession + '\'' +
                ", introduce='" + introduce + '\'' +
                ", difficult=" + difficult +
                ", threshold=" + threshold +
                ", cycle='" + cycle + '\'' +
                ", need_num=" + need_num +
                ", money_low='" + money_low + '\'' +
                ", money_mid='" + money_mid + '\'' +
                ", money_high='" + money_high + '\'' +
                ", stu_num='" + stu_num + '\'' +
                ", tip='" + tip + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public Profession(long id, String direction,String profession, String introduce, int difficult, int threshold, String cycle, int need_num, String money_low, String money_mid, String money_high, int stu_num, String tip, String details) {
        this.id = id;
        this.direction = direction;
        this.profession = profession;
        this.introduce = introduce;
        this.threshold = threshold;
        this.difficult = difficult;
        this.cycle = cycle;
        this.need_num = need_num;
        this.money_low = money_low;
        this.money_mid = money_mid;
        this.money_high = money_high;
        this.stu_num = stu_num;
        this.tip = tip;
        this.details = details;
    }

    public Profession(){
        super();
    }
}
