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
    public static Point inputPoint(String inputX, String inputY) {
        float x1, y1;
        String inputErrorX = "Hoanh do la so thuc.Vui long nhap lai!";

        String inputErrorY = "Tung do la so thuc.Vui long nhap lai!";

        x1 = input(inputX, inputErrorX);
        y1 = input(inputY, inputErrorY);
        Point p = new Point(x1, y1);
        return p;
    }

    public static float input(String input, String inputError) {
        String x1;
        float X1 = 0;
        do {
            x1 = JOptionPane.showInputDialog(input);
            if (x1 == null) {
                break;
            } else {
                try {
                    X1 = Float.parseFloat(x1);
                    break;
                } catch (NumberFormatException ex) {
                    input = inputError;
                    continue;
                }
            }
        } while (true);
        return X1;
    }

    // d. 
    public static String printResult(Point p) {
        return p.pointName + "(" + p.getX() + " , " + p.getY() + ")";
    }

    // e. 
    public static void main(String[] args) {

        String inputX = "Nhap hoanh do diem thu nhat :";
        String inputY = "Nhap tung do diem thu nhat :";
        Point p1 = new Point();
        System.out.println(printResult(p1));

        Point p2 = new Point(3, 4);
        System.out.println(printResult(p2));

        Point p3 = new Point("B", 5, 6);
        System.out.println(printResult(p3));

        Point p4 = new Point(p3);
        System.out.println(printResult(p4));

        System.out.println(printResult(inputPoint(inputX, inputY)));
    }
}
