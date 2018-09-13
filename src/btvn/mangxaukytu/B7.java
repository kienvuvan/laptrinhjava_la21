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
public class B7 {

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
        System.out.println("In ra man hinh so lan xuat hien cua cac so trong day : ");
        for (Float key : hm.keySet()) {
            System.out.println("So "+key +" xuat hien : "+ hm.get(key) + " lan");
        }
        System.out.println("");
    }
}
