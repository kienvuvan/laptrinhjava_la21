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
public class HinhTru extends HinhTron{
    private double chieuCao;

    public HinhTru() {
    }

    public HinhTru(double chieuCao, double banKinh) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    
    public double calVolume(){
        return chieuCao*super.calArea();
    }
}
