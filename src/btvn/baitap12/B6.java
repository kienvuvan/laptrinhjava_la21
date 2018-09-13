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
public class B6 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Trịnh Thăng Bình");
        al.add("Vũ Văn Kiên");
        al.add("Trần Quốc Đạt");
        al.add("Trần Văn Bình");
        int count =0;
        for(int i=0;i<al.size();i++){
            if(getName(al.get(i)).equalsIgnoreCase("Bình")){
                count ++;
            }
        }
        System.out.println("So hoc sinh ten Bình : "+ count);
    }
    
    public static String getName(String name){
        StringTokenizer stk = new StringTokenizer(name.trim(), " ");
        ArrayList<String> al = new ArrayList<>();
        while (stk.hasMoreElements()) {
            al.add(stk.nextToken());
        }
        return al.get(al.size()-1);
    }
}
