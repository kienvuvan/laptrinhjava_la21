/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B4;

/**
 *
 * @author kien vu
 */
public class HinhTron {
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double calArea(){
        return Math.PI*Math.pow(banKinh, 2);
    }

    @Override
    public String toString() {
        return "HinhTron{" + "banKinh=" + banKinh + '}';
    }
    
}
