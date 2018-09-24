/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b5_cautrucdulieutrongjava.B2;

import java.io.Serializable;

/**
 *
 * @author kien vu
 */
public class Student implements Serializable{
    private int codeStudent;
    private String name;
    private String address;

    public Student(int codeStudent, String name, String address) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(int codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
