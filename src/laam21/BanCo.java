/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.Random;

/**
 *
 * @author kien vu
 */
public class BanCo {

    public static void main(String[] args) throws InterruptedException {
        int[][] banCo = new int[8][8];
        Random rd = new Random();
        int x = 4;
        int y = 4;
        boolean check = true;
        while (check) {
            int a = rd.nextInt(8);
            System.out.println(a);
            try {
                switch (a) {
                    case 0:
                        x -= 2;
                        y -= 1;
                        break;
                    case 1:
                        x -= 2;
                        y += 1;
                        break;
                    case 2:
                        x += 2;
                        y -= 1;
                        break;
                    case 3:
                        x += 2;
                        y += 1;
                        break;
                    case 4:
                        x -= 1;
                        y -= 2;
                        break;
                    case 5:
                        x -= 1;
                        y += 2;
                        break;
                    case 6:
                        x += 1;
                        y -= 2;
                        break;
                    case 7:
                        x += 1;
                        y += 2;
                        break;
                }
                System.out.println(banCo[x][y]);
                System.out.println("Toa do con ma la [" + x + " , " + y + "]");
                Thread.sleep(2000);
            } catch (ArrayIndexOutOfBoundsException ex) {
                x = y = 4;
                System.out.println("Con ma da di ra ngoai");
            }
        }
    }
}
