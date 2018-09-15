/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong.btap3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kien vu
 */
public class Test {

    public static void main(String[] args) throws IOException {
        //Nhap danh sach cac user va luu vao file

        boolean check = true;
        File file = new File("src/btvn/b4_luong/btap3/test2.txt");
        while (check) {
            System.out.println("Chon chuc nang");
            System.out.println("1. Nhap user");
            System.out.println("2. Doc file user");
            System.out.println("3. Thoat");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Nhap thong tin user");
                    System.out.println("Ten tai khoan : ");
                    Scanner sc1 = new Scanner(System.in);
                    String username = sc1.nextLine();
                    System.out.println("Tuoi : ");
                    int age = sc1.nextInt();
                    System.out.println("Dia chi : ");
                    Scanner sc2 = new Scanner(System.in);
                    String address = sc2.nextLine();
                    System.out.println("Diem : ");
                    float score = sc2.nextFloat();
                    User user = new User(username, age, address, score);
                    writeToFile(user, file);
                    break;
                case 2:
                    readeFile(file);

                    break;
                case 3:
                    check = false;
                    break;
                default:
                    System.out.println("Vui long chon lai chuc nang");
                    break;
            }
        }
    }

    public static void writeToFile(User user, File file) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file, true));
            oos.writeObject(user);
            System.out.println("Success");
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void readeFile(File file) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User arr = (User) ois.readObject();
//            User[] arr = (User[]) ois.readObject();
//            ArrayList<User> al = new ArrayList<>();
//            for(int i=0;i<arr.length;i++){
//                al.add(arr[i]);
//            }
//            Collections.sort(al, new SortByName());
            System.out.println("Danh sach user sap xep theo ten : ");
//            for(int i=0;i<arr.length;i++){
            System.out.println(arr.toString());
//            }
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
