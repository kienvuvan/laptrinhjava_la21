/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B1;

/**
 *
 * @author kien vu
 */
public class Diem {

    private int x, y;

    public Diem() {
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double calDistance(int x1, int y1){
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
    }

    @Override
    public String toString() {
        return "Diem{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
