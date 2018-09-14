/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.cautruclap;

/**
 *
 * @author kien vu
 */
public class B2 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -2, 10, 5, 11, 6};
        System.out.print("Day ban dau : ");
        printArray(arr);
        System.out.print("\nDay sau khi sap xep theo thuat toan sap xep chen : ");
        insertionSort(arr);
        printArray(arr);
        System.out.println("");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
