/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.baitap12;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author kien vu
 */
public class B7 {

    public static void main(String[] args) {
        String test = "Vu Van Kien Pham Thi Dieu Thuy";
        ArrayList<String> al = cutString(test);
        System.out.println("Cac tu dai nhat trong xau la : ");
        int maxLength = searchLengthMax(al);
        printResult(al, maxLength);
    }

    public static ArrayList<String> cutString(String test) {
        StringTokenizer stk = new StringTokenizer(test, " ");
        ArrayList<String> al = new ArrayList<>();
        while (stk.hasMoreTokens()) {
            al.add(stk.nextToken());
        }
        return al;
    }

    public static void printResult(ArrayList<String> al, int maxLength) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() == maxLength) {
                System.out.println(al.get(i));
            }
        }
    }

    public static int searchLengthMax(ArrayList<String> al) {
        int maxLength = 0;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() > maxLength) {
                maxLength = al.get(i).length();
            }
        }
        return maxLength;
    }
}
