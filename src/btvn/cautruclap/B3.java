/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.cautruclap;

import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class B3 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, -2, 10, 5, 11, 6};
        System.out.println("Nhap gia tri nguyen can tim : ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        System.out.print("Mang ban dau : ");
        B2.printArray(arr);
        System.out.print("\nMang sau khi sap xep : ");
        B2.insertionSort(arr);
        B2.printArray(arr);
        int result = binarySearch(arr, 0, arr.length - 1, search);
        System.out.println("");
        if (result == -1) {
            System.out.println("Day so da cho khong co phan tu co gia tri " + search);
        } else {
            System.out.println("Phan tu dau tien co gia tri " + search + " nam o vi tri " + result);
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int search) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (search == arr[mid]) {
                return mid;
            } else if (search < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
