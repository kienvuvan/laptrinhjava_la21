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
public class TacGia {
    private String ten;
    private String email;
    private String thongTinTacGia;

    public TacGia(String ten, String email, String thongTinTacGia) {
        this.ten = ten;
        this.email = email;
        this.thongTinTacGia = thongTinTacGia;
    }

    @Override
    public String toString() {
        return "TacGia{" + "ten=" + ten + ", email=" + email + ", thongTinTacGia=" + thongTinTacGia + '}';
    }
    
    
}
