/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b3_xulyngoaile;

import javax.swing.JOptionPane;

/**
 *
 * @author kien vu
 */
public class B1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Nhap 1 so nguyen : ");
        try{
            int result = Integer.parseInt(input);
        }catch(NumberFormatException nfx){
            JOptionPane.showMessageDialog(null, "Ban nhap khong phai so nguyen");
        }
    }
}
