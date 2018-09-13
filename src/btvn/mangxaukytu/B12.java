/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.mangxaukytu;

import java.util.StringTokenizer;

/**
 *
 * @author kien vu
 */
public class B12 {
    public static void main(String[] args) {
        String test = "    Vu vAn    KiEn    ";
//        String[] arr = test.trim().split(" ");
//        System.out.println(Arrays.toString(arr));
        StringTokenizer stk = new StringTokenizer(test.trim(), " ");
        while (stk.hasMoreElements()) {
            System.out.print(convertString(stk.nextToken())+" ");
        }
        System.out.println("");
    }
    
    //Chuyen chu cai dau thanh chu hoa
    public static String convertString(String str){
        return str.substring(0, 1).toUpperCase().concat(str.substring(1).toLowerCase());
    }
}
