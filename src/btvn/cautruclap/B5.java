/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.cautruclap;

/**
 *
 * @author kien vu
 */
public class B5 {
    public static void main(String[] args) {
        System.out.println("So luong so chia het cho 3 tu 1-100 : "+ coutDivi(100, 3, 0));
        System.out.println("So luong so chia cho 3 du 1 tu 1-100 : "+ coutDivi(100, 3, 1));
        System.out.println("So luong so chia cho 3 du 2 tu 1-100 : "+ coutDivi(100, 3, 2));
    }
    
    /* Ham dem so luong so chia lay du
    n: Day so tu nhien tu 1-n
    x: Gia tri chia lay du
    d: Phan du
    */
    public static int coutDivi(int n, int x, int d){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%x==d){
                count++;
            }
        }
        return count;
    }
    
}
