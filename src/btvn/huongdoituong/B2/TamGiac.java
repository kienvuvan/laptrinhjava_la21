/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B2;

import btvn.huongdoituong.B1.Diem;

/**
 *
 * @author kien vu
 */
public class TamGiac {

    private Diem point1;
    private Diem point2;
    private Diem point3;

    public TamGiac(Diem point1, Diem point2, Diem point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public TamGiac(int x1, int y1, int x2, int y2, int x3, int y3) {
        point1.setX(x1);
        point1.setY(y1);
        point2.setX(x2);
        point2.setY(y2);
        point3.setX(x3);
        point3.setY(y3);
    }

    public boolean checkTriagle(TamGiac tamGiac) {
        Diem p1 = tamGiac.point1;
        Diem p2 = tamGiac.point2;
        Diem p3 = tamGiac.point3;
        double a12 = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        double a23 = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        double a31 = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
        if ((a12 + a23 <= a31) || (a23 + a31 <= a12) || (a31 + a12 <= a23)) {
            return false;
        }
        return true;
    }

    public double calArea(TamGiac tamGiac) {
        Diem p1 = tamGiac.point1;
        Diem p2 = tamGiac.point2;
        Diem p3 = tamGiac.point3;
        double a12 = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        double a23 = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
        double a31 = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
        double p = (a12 + a23 + a31) / 2;
        if (checkTriagle(tamGiac)) {
            return Math.sqrt(p*(p-a12)*(p-a23)*(p-a31));
        }
        return 0;
    }

    @Override
    public String toString() {
        return "TamGiac{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + '}';
    }

}
