/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.cautruclap;

import btvn.mangxaukytu.B9;

/**
 *
 * @author kien vu
 */
public class B4 {

    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        System.out.println("In ra 15 so nguyen to dau tien : ");
        while (count < 15) {
            if (B9.checkPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        System.out.println("");
    }
}
