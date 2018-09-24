/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kien vu
 */
public class GPT {

    public static void main(String[] args){
        //Giai phuong trinh ax = b
        try {
            System.out.println("Nhap a :");
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            System.out.println("Nhap b :");
            double b = sc.nextDouble();
            Double x = new Double(0);
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    x = -b / a;
                }
            } else {
                x = -b / a;
                if(x.isInfinite()){
                    throw new Exception("Loi vo han");
                }
                System.out.println("Phuong trinh co nghiem " + x);
            }
        } catch (InputMismatchException ime) {
            System.out.println("Vui long nhap so");
        } catch (NumberFormatException nfe) {
            System.out.println("So ban nhap dinh dang khong dung.Vui long nhap lai");
        } catch (ArithmeticException ae) {
            System.out.println("Phuong trinh vo nghiem " + ae.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
