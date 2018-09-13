/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.mangxaukytu;

/**
 *
 * @author kien vu
 */
public class B4 {

    public static void main(String[] args) {
        float arr[] = {1.4f, 1.3f, 1.3f, 1.5f, 2.0f, 2.0f};
        System.out.println("Day so cac phan tu xuat hien 1 lan trong mang so thuc tren : ");
        for (int i = 0; i < arr.length; i++) {
            int check = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] && i != j) {
                    check++;
                }
            }
            if (check == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");
    }
}
