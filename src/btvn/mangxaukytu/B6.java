/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.mangxaukytu;

import java.util.HashMap;

/**
 *
 * @author kien vu
 */
public class B6 {

    public static void main(String[] args) {
        float arr[] = {1.4f, 1.3f, 1.3f, 1.5f, 2.0f, 2.0f, 2.0f};
        HashMap<Float, Integer> hm = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i]) == false) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }
        if (hm.containsValue(2) == false) {
            System.out.println("Trong day khong co phan tu nao xuat hien dung 2 lan");
        } else {
            System.out.println("Day cac so trong day xuat hien dung 2 lan : ");
            for (Float key : hm.keySet()) {
                if(hm.get(key)==2){
                    System.out.print(key +" ");
                }
            }
        }
        System.out.println("");
    }
}
