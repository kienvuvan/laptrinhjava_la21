/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b5_cautrucdulieutrongjava.B1;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author kien vu
 */
public class GuessingGame {

    // 1.Them vao thuoc tinh target kieu int va thuoc tinh guess kieu Vector
    private static int target;
    private static Vector guesses;

    // 2.Them ham constructor lay tham so int, tham so nay se duoc luu trong thuoc tinh target.
    //Trong ham constructor nay khoi tao bien guesses voi gia tri dung luong = 100 va gia tri tang dung luong la 25 
    public GuessingGame(int target) {
        this.target = target;
        guesses = new Vector(100, 25);
    }

    // 3.Them 1 phuong thuc chua vong lap while sinh ra 1 cach ngau nhien 1 gia tri kieu int nam trong khoang 1-100
    // Neu gia tri ngau nhien nay bang voi gia tri target thi thoat khoi vong lap 
    // Neu khong se them gia tri nay vao guesses va tiep tuc vong lap
    public static void startGuessing() {
        Random rd = new Random();
        while (true) {
            int r = rd.nextInt(99) + 1;
            if (r == target) {
                break;
            } else {
                guesses.add(r);
            }
        }
    }

    // 4.Them phuong thuc su dung vong lap for de in ra tat ca cac phan tu co trong guesses.Ket thuc vong lap in ra do lon cua guesses
    public static void printGuesses() {
        System.out.println("Danh sach cac phan tu co trong guesses : ");
        for (int i = 0; i < guesses.size(); i++) {
            System.out.print(guesses.get(i) + " ");
        }
        System.out.println("");
        System.out.println("So phan tu cua guesses : " + guesses.size());
    }

    // 5. Them ham main() phan tich gia tri nguyen cua tham so dau vao su dung Integer.parseInt() va gan gia tri nay vao bien target
    // 6. Tao 1 doi tunog GuessingGame truyen gia tri tham so dong lenh, goi ham startGuessing() sau do goi printGuesses()
    // 7. Luu tru va bien dich lop GuessingGame
    public static void main(String[] args) {
        System.out.println("Vui long nhap 1 so nguyen : ");
        Scanner sc = new Scanner(System.in);
        do {
            String input = sc.nextLine();
            try {
                int inputNumber = Integer.parseInt(input);
                GuessingGame gg = new GuessingGame(inputNumber);
                startGuessing();
                printGuesses();
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Vui long nhap 1 so nguyen : ");
            }
        } while (true);
    }

}
