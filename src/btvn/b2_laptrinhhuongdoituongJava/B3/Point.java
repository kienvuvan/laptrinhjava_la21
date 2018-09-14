/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B3;

import javax.swing.JOptionPane;

/**
 *
 * @author kien vu
 */
public class Point {

    private String pointName;
    private float x;
    private float y;

    // a. Phuong thuc get/set
    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // b. Phuong thuc khoi tao
    // i. 
    public Point() {
        pointName = "A";
        x = 0.0f;
        y = 0.0f;
    }

    // ii.
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // iii.
    public Point(String pointName, float x, float y) {
        this.pointName = pointName;
        this.x = x;
        this.y = y;
    }

    // iv.
    public Point(Point p) {
        this.pointName = p.getPointName();
        this.x = p.getX();
        this.y = p.getY();
    }

    // c. 
    public static void inputPoint() {
        String x1, y1;
        float X1, Y1;
        boolean check = true;
        do {
            check = true;
            x1 = JOptionPane.showInputDialog("Nhap tung do : ");
            if (x1 == null) {
                break;
            } else {
                try {
                    X1 = Float.parseFloat(x1);
                    break;
                } catch (NumberFormatException ex) {
                    x1 = JOptionPane.showInputDialog("Tung do la so thuc. Vui long nhap lai: ");
                }
            }
        } while (check);
    }

    public static void main(String[] args) {
        String test = "a";

        inputPoint();
    }

}
