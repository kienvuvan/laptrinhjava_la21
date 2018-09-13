/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.baitap12;

import java.util.StringTokenizer;

/**
 *
 * @author kien vu
 */
public class B4 {
    public static void main(String[] args) {
        String test = "    Vu Van    Kien    ";
        StringTokenizer stk = new StringTokenizer(test.trim(), " ");
        while (stk.hasMoreElements()) {
            System.out.print(stk.nextToken()+" ");
        }
        System.out.println("");
    }
}
