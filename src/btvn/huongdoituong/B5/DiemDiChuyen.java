/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B5;

/**
 *
 * @author kien vu
 */
public class DiemDiChuyen implements GiaoDienDiChuyen{

    private float x;
    private float y;
    private float vx;
    private float vy;

    public DiemDiChuyen(float x, float y, float vx, float vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
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

    public float getVx() {
        return vx;
    }

    public void setVx(float vx) {
        this.vx = vx;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(float vy) {
        this.vy = vy;
    }
    
    
    
    @Override
    public void diLen() {
        System.out.println("Diem di len");
    }

    @Override
    public void diXuong() {
        System.out.println("Diem di xuong");
    }

    @Override
    public void sangTrai() {
        System.out.println("Diem di sang trai");
    }

    @Override
    public void sangPhai() {
        System.out.println("Diemm di sang phai");
    }

    @Override
    public String toString() {
        return "DiemDiChuyen{" + "x=" + x + ", y=" + y + ", vx=" + vx + ", vy=" + vy + '}';
    }
     
}
