/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b1_gioithieuvejava.bai4_cautruclap;

import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class B6 {
    public static void main(String[] args) {
        System.out.println("Nhap gia tri N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = calSum(n);
        System.out.println(sum);
    }
    
    public static float calSum(int n){
        int i =1;
        float sum =0;
        int fac = 1;
        while(i<=n){
            fac *=i;
            sum +=1.0/fac;
            i++;
        }
        return sum;
    }
}
