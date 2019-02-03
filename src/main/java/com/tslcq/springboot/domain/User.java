package com.tslcq.springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author yangzengchun
 * @Title: User
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019-02-0211:53
 */
public class User {

    /**
     * 指定别名
     */
    @JsonProperty("age")
    private int age11111;

    /**
     * 指定不返回给前端的字段
     */
    @JsonIgnore
    private String pwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String  phone;

    public int getAge() {
        return age11111;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setAge(int age) {
        this.age11111 = age;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public User(int age, String pwd, String phone) {
        this.age11111 = age;
        this.pwd = pwd;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age11111 +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
