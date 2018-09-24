/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.cautrucdulieu;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kien vu
 */
public class B1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhap vao so nguyen duong");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n / 2 != 0) {
            stack.push(n % 2);
            n = n / 2;
            if (n == 1) {
                stack.push(1);
            }
        }
//        Iterator ite = stack.iterator();
//        while (ite.hasNext()) {
//            System.out.print(ite.next().toString());
//        }
//        for(int i=stack.size()-1;i>=0;i--){
//            System.out.print(stack.get(i));
//        }
        while (stack.isEmpty() == false) {
            System.out.print(stack.pop());
        }
        System.out.println("");
    }
}
