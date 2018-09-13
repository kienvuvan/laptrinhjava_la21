/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.baitap12;

import java.util.ArrayList;

/**
 *
 * @author kien vu
 */
public class B1 {

    public static void main(String[] args) {
        int[] arr = {-3, 0, 9, 11, -99, 100, 77, -65};
        ArrayList al = searchPositiveNumber(arr);
        arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = (int) al.get(i);
        }
        printArray(arr);
        System.out.println("");
    }

    public static ArrayList searchPositiveNumber(int[] arr) {
        ArrayList al = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                al.add(arr[i]);
            }
        }
        return al;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
