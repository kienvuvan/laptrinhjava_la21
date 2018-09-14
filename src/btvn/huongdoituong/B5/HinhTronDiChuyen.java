/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B5;

import btvn.huongdoituong.B1.Diem;

/**
 *
 * @author kien vu
 */
public class HinhTronDiChuyen implements GiaoDienDiChuyen{
    private float r;
    private Diem tam;

    public HinhTronDiChuyen(float r, Diem tam) {
        this.r = r;
        this.tam = tam;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public Diem getTam() {
        return tam;
    }

    public void setTam(Diem tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "HinhTronDiChuyen{" + "r=" + r + ", tam=" + tam + '}';
    }
    
    @Override
    public void diLen() {
        System.out.println("Hinh tron dang di len");
    }

    @Override
    public void diXuong() {
        System.out.println("Hinh tron dang di xuong");
    }

    @Override
    public void sangTrai() {
        System.out.println("Hinh tron dang di sang trai");
    }

    @Override
    public void sangPhai() {
        System.out.println("Hinh tron dang di sang phai");
    }
    
}
