/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b1_gioithieuvejava.bai12;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author kien vu
 */
public class B5 {

    public static void main(String[] args) {
        String test = "Vu Thi Thu Huong ";
        StringTokenizer stk = new StringTokenizer(test.trim(), " ");
        ArrayList<String> al = new ArrayList<>();
        while (stk.hasMoreElements()) {
            al.add(stk.nextToken());
        }
        StringBuffer middleName = new StringBuffer();
        for (int i = 1; i < al.size() - 1; i++) {
            middleName.append(al.get(i) +" ");
        }
        System.out.println("Phan ho : " + al.get(0));
        System.out.println("Phan ten : " + al.get(al.size() - 1));
        System.out.println("Phan dem : "+ middleName);
    }
}
