/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong.btap3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author kien vu
 */
public class Test {

    static File file = new File("testObject.txt");

    public static void main(String[] args) throws IOException {
        //Nhap danh sach cac user va luu vao file
        boolean check = true;
        Vector<User> v = new Vector<>();
        while (check) {
            System.out.println("Chon chuc nang");
            System.out.println("1. Nhap user");
            System.out.println("2. Ghi vao file");
            System.out.println("3. Doc file user");
            System.out.println("4. TOng diem cac user");
            System.out.println("5. Thoat");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
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
                    v.add(user);
                    break;
                case "2":
                    writeToFile(v, file);
                    break;
                case "3": {
                    readFile(file);
                }
                break;
                case "4":
                    System.out.println(readFile(file));
                    break;
                case "5":
                    check = false;
                    break;
                default:
                    System.out.println("Vui long chon lai chuc nang");
                    break;
            }
        }
    }

    public static void writeToFile(Vector<User> v, File file) {

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v);
            oos.close();
            System.out.println("data write successfully");
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    public static float readFile(File file) {
        float score = 0;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Vector<User> deserializeStudent = (Vector<User>) ois.readObject();
            System.out.println(deserializeStudent);
            ois.close();
            Collections.sort(deserializeStudent, new SortByName());
            Iterator<User> iter = deserializeStudent.iterator();
            while (iter.hasNext()) {
                User s = iter.next();
                System.out.println(
                        "User: " + s.getUser() + ", "
                        + "Age: " + s.getAddress() + ", "
                        + "Adress: " + s.getAge() + ", "
                        + "Score: " + s.getScore()
                );
                score += s.getScore();
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
        return score;
    }

}
