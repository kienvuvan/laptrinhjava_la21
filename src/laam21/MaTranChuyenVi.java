/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

/**
 *
 * @author kien vu
 */
public class MaTranChuyenVi {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 4, 5}, {7, 8, 9}, {10, 11, 12}};
        int[][] arr2 = {{1, 2, 1, 1}, {1, 1, 1, 5}, {6, 5, 3, 2}};
        System.out.println("Ma tran ban dau : ");
        print(arr);
        int[][] arr1 = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        System.out.println("\nMa tran chuyen vi :");
        print(arr1);
        System.out.println("Nhan 2 ma tran");
        nhanMaTran(arr, arr1);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void nhanMaTran(int[][] arr, int[][] arr1) {
        if (arr.length == arr1[0].length) {
            System.out.println(arr.length);
            int[][] arrResult = new int[arr.length][arr1[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    int sum = 0;
                    for (int k = 0; k < arr1.length; k++) {
                        sum += arr[i][k] * arr1[k][j];
                    }
                    arrResult[i][j] = sum;
                }
            }
            print(arrResult);
        } else {
            System.out.println("Hai ma tran ");
        }
    }
}
