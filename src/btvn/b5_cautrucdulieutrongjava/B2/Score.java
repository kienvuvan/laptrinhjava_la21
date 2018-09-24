/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b5_cautrucdulieutrongjava.B2;

/**
 *
 * @author kien vu
 */
public class Score {

    private int id;
    private Student student;
    private float score;

    public Score() {
    }

    public Score(int id, Student student, float score) {
        this.id = id;
        this.student = student;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    
}
