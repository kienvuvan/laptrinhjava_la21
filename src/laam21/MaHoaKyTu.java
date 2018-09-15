/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

/**
 *
 * @author kien vu
 */
public class MaHoaKyTu {

    public static void main(String[] args) {
        String str = "a";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            int c = ((int) str.charAt(i) * 7 + 20) % 26;
            sb.append((char) c);
        }
        System.out.println(sb);
        StringBuffer sbResult = new StringBuffer();
        for (int i = 0; i < sb.length(); i++) {
            int c = giaiMa(sb.charAt(i));
            sbResult.append((char) c);
        }
        System.out.println(sbResult);
    }

    public static int giaiMa(int c) {
        int d = ((c - 20) * 15) % 26;
        return d > 0 ? d : 26 + d;
    }

}
