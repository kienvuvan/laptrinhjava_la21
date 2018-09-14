/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B2;

import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class Complex {

    private float real;
    private float virtual;

    // a. Viet cac phuong thuc set/get cho cac thuoc tinh cua lop
    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getVirtual() {
        return virtual;
    }

    public void setVirtual(float virtual) {
        this.virtual = virtual;
    }

    // b. Viet phuong thuc nhap vao 1 so phuc tu ban phim
    public Complex inputComplex() {
        Scanner sc = new Scanner(System.in);
        System.out.println("So phuc : ");
        System.out.println("Nhap phan thuc cua so phuc : ");
        setReal(sc.nextFloat());
        System.out.println("Nhap vao phan ao cua so phuc : ");
        setVirtual(sc.nextFloat());
        return new Complex(real, virtual);
    }

    // c. Viet cac phuong thuc cong, tru 2 so phuc
        // Phuong thuc cong
    public Complex addComplex(Complex cp1, Complex cp2) {
        float real1 = cp1.getReal() + cp2.getReal();
        float virtual1 = cp1.getVirtual() + cp2.getVirtual();
        return new Complex(real1, virtual1);
    }
        // Phuong thuc tru
    public Complex subComplex(Complex cp1, Complex cp2) {
        float real1 = cp1.getReal() - cp2.getReal();
        float virtual1 = cp1.getVirtual() - cp2.getVirtual();
        return new Complex(real1, virtual1);
    }
    
    // d. Mot phuong thuc khoi tao mac dinh co nhiem vu khoi tao cho phan thuc , phan ao co gia tri mac dinh la 0.0 va 1.0
    public Complex() {
        real = 0.0f;
        virtual = 1.0f;
    }

    // e. Mot phuong thuc khoi tao voi 2 tham so thuc de khoi tao cho 
    //  phan thuc va phan ao co gia tri bang gia tri cac tham so tuong ung truyen vao
    public Complex(float real, float virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    // f. Mot phuong thuc khoi tao co tham so la 1 doi tuong cua lop Comple co nhiem vu
    // khoi tao cho phan thuc va phan ao co gia tri bang phan thuc va phan ao cua doi tuong truyen vao
    public Complex(Complex cp) {
        this.real = cp.getReal();
        this.virtual = cp.getVirtual();
    }
    
    // g. 
        // i.
    
    public Complex addComplex(Complex cp){
        return new Complex(this.real + cp.getReal(), this.virtual + cp.getVirtual());
    }
        // ii.
    
    public Complex subComplex(Complex cp) {
        return new Complex(this.real - cp.getReal(), this.virtual - cp.getVirtual());
    }
}
