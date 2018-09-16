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
public class Regex {

    public static void main(String[] args) {
        String str = "10101010100";
        String pattern = "(01)+";
        String pattern1= "(10)+";
        System.out.println(str.matches(pattern) || str.matches(pattern1));
    }
}
