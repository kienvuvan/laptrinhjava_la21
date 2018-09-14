/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b1_gioithieuvejava.bai4_cautruclap;

/**
 *
 * @author kien vu
 */
public class B1 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -2, 10, 5, 11, 6};
        System.out.print("Day ban dau : ");
        printArray(arr);
        System.out.print("\nDay sau khi sap xep theo thuat toan sap xep chon : ");
        selectionSort(arr);
        printArray(arr);
        System.out.println("");
    }

    public static void selectionSort(int[] arr) {
        int pos;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
