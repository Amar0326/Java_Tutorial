package com.example.javatutorial;

public class UserModel {
    String phone_no,username;

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserModel() {

    }
    public UserModel(String phone_no,String username) {
        this.phone_no = phone_no;
        this.username = username;

    }
}
