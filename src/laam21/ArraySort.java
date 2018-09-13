/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu cua mang :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Vui long nhap so nguyen duong");
            n = sc.nextInt();
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            Scanner sc1 = new Scanner(System.in);
            arr[i] = sc1.nextInt();
        }
        System.out.println("Mang sau khi sap xep :");
        quickSort(arr);
    }

    public static void quickSort(int[] array) {
        _quickSort(array, 0, array.length - 1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }

    private static int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }

            list[low] = list[high];
            while (low < high && list[low] <= tmp) {
                low++;
            }

            list[high] = list[low];
        }
        list[low] = tmp;
        return low;
    }

    private static void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _quickSort(list, low, middle - 1);
            _quickSort(list, middle + 1, high);
        }
    }
}
