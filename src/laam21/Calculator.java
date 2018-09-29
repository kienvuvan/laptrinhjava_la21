/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laam21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author kien vu
 */
public class Calculator {

    public String convertPrefix(String[] str) {
        Stack<String> stack = new Stack<String>();
        String result = "";
        for (int i = 0; i < str.length; i++) {
            char c = str[i].charAt(0);
            if (!isOperator(c)) {
                result += " " + str[i];
            } else {
                if (c == '(') {
                    stack.push(str[i]);
                } else {
                    if (c == ')') {
                        char c1;
                        do {
                            c1 = stack.peek().charAt(0);
                            if (c1 != '(') {
                                result += " " + stack.peek();
                            }
                            stack.pop();
                        } while (c1 != '(');
                    } else {
                        while (!stack.isEmpty() && priority(stack.peek().charAt(0)) >= priority(c)) {
                            result += " " + stack.peek();
                            stack.pop();
                        }
                        stack.push(str[i]);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            result += " " + stack.peek();
            stack.pop();
        }
        return result;
    }

    public boolean isOperator(char c) {
        char operator[] = {'+', '-', '*', '/', '(', ')'};
        Arrays.sort(operator);
        if (Arrays.binarySearch(operator, c) > -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperatorInprefix(String c) {
        String operator[] = {"+", "-", "*", "/"};
        Arrays.sort(operator);
        if (Arrays.binarySearch(operator, c) > -1) {
            return true;
        } else {
            return false;
        }
    }

    int priority(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public String[] processString(String str) {
        str = str.trim();
        String s1 = "";
        str = str.replaceAll("\\s+", " ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isOperator(c)) {
                s1 += c;
            } else {
                s1 += " " + c + " ";
            }
        }
        s1 = s1.trim();
        s1 = s1.replaceAll("\\s+", " ");
        return s1.split(" ");
    }

    public void calPrefix(String prefix) {
        String[] arr = prefix.split(" ");
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        while (al.size() > 1) {
            for (int i = 2; i < al.size(); i++) {
                if (isOperatorInprefix(al.get(i))) {
                    float rs = 0;
                    switch (al.get(i)) {
                        case "+":
                            rs = Float.parseFloat(al.get(i - 2)) + Float.parseFloat(al.get(i - 1));
                            break;
                        case "-":
                            rs = Float.parseFloat(al.get(i - 2)) - Float.parseFloat(al.get(i - 1));
                            break;
                        case "*":
                            rs = Float.parseFloat(al.get(i - 2)) * Float.parseFloat(al.get(i - 1));
                            break;
                        case "/":
                            rs = Float.parseFloat(al.get(i - 2)) / Float.parseFloat(al.get(i - 1));
                            break;
                    }
                    al.remove(i);
                    al.remove(i - 1);
                    al.remove(i - 2);
                    al.add(i - 2, rs + "");
                    break;
                }
            }
        }
        System.out.println(al.get(0));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String str = "(10+20)*30+50/5";
        String prefix = calculator.convertPrefix(calculator.processString(str));
        System.out.println("Bieu thuc trung to : "+str);
        System.out.println("Bieu thuc hau to : " +prefix);
        String[] arr = prefix.trim().split(" ");
        System.out.println("Ket qua phep tinh : ");
        calculator.calPrefix(prefix.trim());
    }
}
