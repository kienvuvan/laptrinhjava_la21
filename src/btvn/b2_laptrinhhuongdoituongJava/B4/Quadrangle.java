/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B4;

import btvn.b2_laptrinhhuongdoituongJava.B3.Point;
import static btvn.b2_laptrinhhuongdoituongJava.B3.Point.printResult;

/**
 *
 * @author kien vu
 */
public class Quadrangle {

    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    // a.
    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    // b. 
    // i. 
    public Quadrangle() {
        p1 = new Point("A", 0, 0);
        p2 = new Point("B", 0, 1);
        p3 = new Point("C", 1, 1);
        p4 = new Point("D", 1, 0);
    }

    // ii.
    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    // c.

    public static Quadrangle inputQuadrangle() {
        String inputX = "Nhap hoanh do diem thu ";
        String inputY = "Nhap tung do diem thu ";
        Point[] arr = new Point[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Point.inputPoint(inputX + (i + 1), inputY + (i + 1));
        }
        return new Quadrangle(arr[0], arr[1], arr[2], arr[3]);
    }
    
    public String getName(){
        return "Tu giac voi 4 dinh co toa do lan luot la : "
                + printResult(p1) +", "+ printResult(p2)+", "
                + printResult(p3 )+", "+ printResult(p4) ;
    }
}
