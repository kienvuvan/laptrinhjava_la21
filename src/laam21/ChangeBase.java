/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class ChangeBase {

    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n / 2 != 0) {
            sb.append(n % 2);
            n = n / 2;
            if (n == 1) {
                sb.append(1);
            }
        }
        System.out.println(sb.reverse());
    }
}
