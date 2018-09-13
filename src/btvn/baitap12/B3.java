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
public class B3 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tong cac phan tu tren duong cheo chinh : "+ sum);
    }
}
