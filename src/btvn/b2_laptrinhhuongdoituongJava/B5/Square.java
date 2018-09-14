/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B5;

import btvn.b2_laptrinhhuongdoituongJava.B3.Point;
import btvn.b2_laptrinhhuongdoituongJava.B4.Quadrangle;

/**
 *
 * @author kien vu
 */
public class Square extends Quadrangle {

    private Point tamDX;
    
    // a.

    public Point getTamDX() {
        return tamDX;
    }

    public void setTamDX(Point tamDX) {
        this.tamDX = tamDX;
    }
    
    // b.

    public Square() {
        super(new Point("A", 0, 0), new Point("B", 0, 1), new Point("C", 1, 1), new Point("D", 1, 0));
    }

    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        this.tamDX = new Point((p1.getX()+p3.getX())/2, (p1.getY()+p3.getY())/2);
    }

    // c.
    @Override
    public String getName(){
        return "Hinh vuong voi tam doi xung la : "
                + tamDX.getPointName()+ "("
                + tamDX.getX() +","
                + tamDX.getY() +")";
    }
}
