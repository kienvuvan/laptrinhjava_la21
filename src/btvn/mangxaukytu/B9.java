/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.mangxaukytu;

import java.util.HashMap;

/**
 *
 * @author kien vu
 */
public class B9 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 2, 7}, {10, 5, 7, 4}, {9, 4, 3, 17}};
        //Tim phan tu lon nhat cua ma tran cung chi so cua so do
        searchMaxAndIndex(matrix);

        //Tim va in ra cac phan tu la so nguyen to cua ma tran
        System.out.print("Cac phan tu la so nguyen to cua ma tran : ");
        searchPrime(matrix);
        System.out.println("");

        //Sap xep tat ca cac cot cua ma tran theo thu tu tang dan va in ket qua ra man hinh
        sortMatrix(matrix);
    }

    public static void searchMaxAndIndex(int[][] matrix) {
        int max = matrix[0][0];
        int indexX = 0, indexY = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat cua ma tran la : matrix[" + indexX + "][" + indexY + "] = " + max);
    }

    public static boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        } else if (a == 2) {
            return true;
        } else if (a % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < a / 2; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void searchPrime(int[][] matrix) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (checkPrime(matrix[i][j])) {
                    hm.put(matrix[i][j], 1);
                }
            }
        }
        for (int key : hm.keySet()) {
            System.out.print(key + " ");
        }
    }

    public static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < 4; i++) {
            for(int j=0;j<3;j++){
                int temp =0;
                for(int k=j+1;k<3;k++){
                    if(matrix[k][i]<matrix[j][i]){
                        temp = matrix[j][i];
                        matrix[j][i]= matrix[k][i];
                        matrix[k][i]= temp;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
