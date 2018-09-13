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
public class B3 {
    public static void main(String[] args) {
        int arr[] = {-2, 10, 5, -7, 9, 100, -99, 13, 0, 5};
        int result = 1;
        System.out.print("Tich cac phan tu trong mang co gia tri duong : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                result *= arr[i];
            }
        }
        System.out.println(result);
    }
}
