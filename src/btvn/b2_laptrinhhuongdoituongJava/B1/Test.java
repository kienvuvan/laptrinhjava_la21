/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b2_laptrinhhuongdoituongJava.B1;

/**
 *
 * @author kien vu
 */
public class Test {
    public static void main(String[] args) {
        /*
            1. Voi cau khai bao sau Vehicle v = new Ferrary();
             Cac method sau, lenh nao dung
             a. v.moveRelative(20,30);
             b. v.setSize(50,80);
        */
        
        Vehicle v = new Ferrary();
        //Lenh v.moveRelative(20,30) false
        
        //Lenh v.setSize(50,80) true
        v.setSize(50, 80);
        
        /*
            2. Khai bao sau hop le hay khong
            Car c = new Boat();
        */
        
        //Dap an : Khong hop le
        
        /*
            3. Voi khai bao sau :
                Car c = new Ferrary();
                Lenh sau se in noi dung gi :
                c.setSize(10,10);
        */
        
        //Dap an : Method [setSize] from class [Ferrary]
        Car c = new Ferrary();
        c.setSize(10, 10);
    }
}