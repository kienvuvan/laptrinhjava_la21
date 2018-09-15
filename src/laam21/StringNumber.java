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
public class StringNumber {

    public static void main(String[] args) {
        String s2 = "7812435678";
        String s1 = "2712435676";
        StringBuffer sb1 = new StringBuffer(s1);
        sb1.reverse();
        StringBuffer sb2 = new StringBuffer(s2);
        sb2.reverse();
        StringBuffer sbResult = new StringBuffer();
//        System.out.println(sb1.length()-sb2.length());
        if (sb1.length() < sb2.length()) {
            StringBuffer temp = new StringBuffer();
            temp = sb2;
            sb2 = sb1;
            sb1 = temp;
        }

        char[] arr = new char[sb1.length() - sb2.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = '0';
        }
        sb2.append(arr);
        int nho = 0;
        for (int i = 0; i < sb1.length(); i++) {
            int kqua = Character.getNumericValue(sb1.charAt(i)) + Character.getNumericValue(sb2.charAt(i)) + nho;
            if (kqua >= 10) {
                nho = 1;
                kqua -= 10;
            } else {
                nho = 0;
            }
            sbResult.append(kqua);
            if (i == sb1.length() - 1 && nho == 1) {
                sbResult.append(1);
            }
        }
        System.out.println(sbResult.reverse());
    }
}
