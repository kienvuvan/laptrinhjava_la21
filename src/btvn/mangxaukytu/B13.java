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
public class B13 {

    public static void main(String[] args) {
        String test = "Hello , I'm Vu Van Kiennnnn . I'm a students !";
        StringTokenizer stk = new StringTokenizer(test, " ");
        int max = 0;
        String result = "";
        while (stk.hasMoreElements()) {
            String token = stk.nextToken();
            if (token.length() > max) {
                max = token.length();
                result = token;
            }
        }
        System.out.println("Tu dai nhat trong xau ky tu tren la : "+result);
    }
}
