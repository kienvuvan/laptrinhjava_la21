/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b5_cautrucdulieutrongjava.B2;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author kien vu
 */
public class ClassRoom implements Serializable{
    private String id;
    private String className;
    private int maxStudent;
    private List<Student> listRegister;

    public ClassRoom() {
    }

    public ClassRoom(String id, String className, int maxStudent, List<Student> listRegister) {
        this.id = id;
        this.className = className;
        this.maxStudent = maxStudent;
        this.listRegister = listRegister;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public void setMaxStudent(int maxStudent) {
        this.maxStudent = maxStudent;
    }

    public List<Student> getListRegister() {
        return listRegister;
    }

    public void setListRegister(List<Student> listRegister) {
        this.listRegister = listRegister;
    }
    
}
