/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.baitap12;

/**
 *
 * @author kien vu
 */
public class B2 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, -7, 99, 10, 17, 30, 60, 70};
        System.out.println("Day so con dai nhat don dieu tang la : ");
        searchLongestChild(arr);
        System.out.println("");
    }

    public static void searchLongestChild(int[] arr) {
        int maxLength;
        int maxCurrent = 1;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            maxLength = 1;
            int j = i;
            while (arr[j + 1] > arr[j]) {
                if (j + 1 == arr.length - 1) {
                    maxLength++;
                    break;
                } else {
                    maxLength++;
                    j++;
                }
            }
            if (maxLength > maxCurrent) {
                maxCurrent = maxLength;
                index = i;
            }
        }
        for (int i = index; i <= index + maxCurrent - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
