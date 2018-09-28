/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.lamviecvoifile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kien vu
 */
public class B2 {
    
    public static void main(String[] args) {
        try {
            myCopy("src\\btvn\\lamviecvoifile\\test1.txt", "src\\btvn\\lamviecvoifile\\test");
            myCopy("src\\btvn\\lamviecvoifile\\test1.txt", "src\\btvn\\lamviecvoifile\\test2.txt");
            myCopy("src\\btvn\\lamviecvoifile\\con.txt", "src\\btvn\\lamviecvoifile\\test2.txt");
        } catch (IOException ex) {
            Logger.getLogger(B2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void myCopy(String filename1, String filename2) throws FileNotFoundException, IOException {
        File f1 = new File(filename1);
        File f2 = new File(filename2);
        if (f1.isFile()) {
            if (f2.isFile()) {
                copy(f1, f2);
            } else if (f2.isDirectory()) {
                File f3 = new File(filename2 + "\\filecopy.txt");
                if (f3.createNewFile()) {
                    copy(f1, f3);
                }
            }   
        }
        if(getNameFile(f1).equalsIgnoreCase("con")){
            System.out.println("Nhap noi dung can copy vao file 2 : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if(f2.isFile()){
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2));
                dos.writeBytes(str);
            }else if(f2.isDirectory()){
                File f3 = new File(filename2 + "\\filecopy.txt");
                if(f3.createNewFile()){
                    DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2));
                    dos.writeBytes(str);
                }
            }
        }
    }
    
    public static void copy(File f1, File f2) throws FileNotFoundException, IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(f1));
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f2));
        byte[] buffer = new byte[1024];
        int read = 0;
        while ((read = dis.read(buffer)) != -1) {
            dos.write(buffer, 0, read);
        }
        dis.close();
        dos.close();
    }
    
    public static String getNameFile(File f1) {
        String name = f1.getName();
        StringTokenizer stk = new StringTokenizer(name, ".");
        while (stk.hasMoreTokens()) {
            return stk.nextToken();
        }
        return "";
    }
}
