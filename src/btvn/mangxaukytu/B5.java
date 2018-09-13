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
public class B5 {

    public static void main(String[] args) {
        float arr[] = {1.4f, 1.3f, 1.3f, 1.5f, 2.0f, 2.0f};
        float x = 1.3f;
        float y = 2.1f;
        System.out.println("Chi so phan tu dau tien trong mang co gia tri bang x = 1.3f : " + searchIndex(arr, x));
        System.out.println("Chi so phan tu dau tien trong mang co gia tri bang y = 2.1f : " + searchIndex(arr, y));
    }

    public static int searchIndex(float[] arr, float x) {
        int result = 0;
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result = i;
                break;
            } else {
                check++;
            }
        }
        if (check == arr.length) {
            result = -1;
        }
        return result;
    }
}
