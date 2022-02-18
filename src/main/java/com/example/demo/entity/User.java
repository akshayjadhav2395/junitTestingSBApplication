package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int uid;
    private String uname;
    private String address;
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public User() {

    }

    public User(int uid, String uname, String address) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.address = address;
    }
    @Override
    public String toString() {
        return "User [uid=" + uid + ", uname=" + uname + ", address=" + address + "]";
    }
}
