/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong.btap3;

import java.io.Serializable;

/**
 *
 * @author kien vu
 */
public class User implements Serializable {

    private String user;
    private int age;
    private String address;
    private float score;

    public User(String user, int age, String address, float score) {
        this.user = user;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public User() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public int compareTo(User a, User b) {
        return a.getUser().compareToIgnoreCase(b.getUser());
    }

    @Override
    public String toString() {
        return "User{" + "user=" + user + ", age=" + age + ", address=" + address + ", score=" + score + '}';
    }

}
