/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.huongdoituong.B3;

/**
 *
 * @author kien vu
 */
public class Sach {
    private String ten;
    private String tacGia;
    private float gia;
    private int soTrang;

    public Sach(String ten, String tacGia, float gia, int soTrang) {
        this.ten = ten;
        this.tacGia = tacGia;
        this.gia = gia;
        this.soTrang = soTrang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + "ten=" + ten + ", tacGia=" + tacGia + ", gia=" + gia + ", soTrang=" + soTrang + '}';
    }
    
    
}
