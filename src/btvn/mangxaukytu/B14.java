/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.mangxaukytu;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author kien vu
 */
public class B14 {
    public static void main(String[] args) {
        String fullName = "Vu Van Hoa Hoa Hoa Cap";
        StringTokenizer stk = new StringTokenizer(fullName, " ");
        ArrayList<String> al = new ArrayList<>();
        while (stk.hasMoreElements()) {
            al.add(stk.nextToken());
        }
        StringBuilder middleName = new StringBuilder("");
        for(int i =1;i<al.size()-1;i++){
            middleName.append(al.get(i)).append(" ");
        }
        //Chuyen xau sang bieu dien cau truc ten...ho...dem
        System.out.println("Ten sau khi chuyen :" + al.get(al.size()-1)+" "+al.get(0) +" " + middleName);
    }
}
