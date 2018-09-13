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
public class PTB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Phuong trinh bac 2 dang a*x^2 + b*x + c = 0");
        System.out.println("Nhap so a : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Nhap so b : ");
        float b = sc.nextFloat();
        System.out.println("Nhap so c : ");
        float c = sc.nextFloat();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                System.out.println("Phuong trinh co nghiem : "+ -c/b);
            }
        }else{
            float delta = b*b- 4*a*c;
            if(delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(delta==0){
                System.out.println("Phuong trinh co nghiem kep :" + -b/(2*a));
            }else{
                System.out.println("Phuong trinh co 2 nghiem : \nNghiem 1 :"+(-b+Math.sqrt(delta))/(2*a)+"\nNghiem 2 :"+(-b+Math.sqrt(delta))/(2*a));
            }
        }
    }
    
}
