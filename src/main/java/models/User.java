package models;

import java.util.Date;

public class User {
    private int user_id;
    private String fullname;
    private String phone_number;
    private String email;
    private int gender;
    private Date date_of_birth;
    private Account account;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User(int user_id, String fullname, String phone_number, String email, int gender, Date date_of_birth, Account account) {
        this.user_id = user_id;
        this.fullname = fullname;
        this.phone_number = phone_number;
        this.email = email;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.account = account;
    }

    public User() {
    }
}
