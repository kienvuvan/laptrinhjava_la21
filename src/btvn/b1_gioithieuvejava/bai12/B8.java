/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b1_gioithieuvejava.bai12;

/**
 *
 * @author kien vu
 */
public class B8 {
    public static void main(String[] args) {
        String test ="01010101001110100";
        char[] arr = reseverString(test);
        System.out.println("Chuoi ban dau :          "+ test);
        System.out.print("Chuoi sau khi bien doi : ");
        printResult(arr);
        System.out.println("");
    }
    
    public static char[] reseverString(String test){
        char[] arr = test.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }else{
                arr[i]='0';
            }
        }
        return arr;
    }
    
    public static void printResult(char[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
