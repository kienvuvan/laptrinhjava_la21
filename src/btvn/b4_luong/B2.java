/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author kien vu
 */
public class B2 {

    public static void main(String[] args) throws IOException {
        File path = new File("src/btvn/b4_luong/test.txt");
        File path1 = new File("src/btvn/b4_luon");
        if (path.isFile()) {
            System.out.println("File ton tai");
            if (path1.isDirectory()) {
                System.out.println("Thu muc ton tai");
            } else {
                System.out.println("Thu muc khong ton tai");
                path1.mkdirs();
                System.out.println("Tao moi thu muc thanh cong");
            }
            File file = new File(path1, "test1.txt");
            file.createNewFile();
            
            // Copy su dung In/Out Stream
            copyByInOutStream(path, file);
            
            // Copy su dung BufferedReader/BufferedWriter
            copyByReader(path, file);
            System.out.println("Copy thanh cong");
        } else {
            System.out.println("File khong ton tai");
        }
    }

    public static void copyByInOutStream(File source, File destination) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream(source);
        OutputStream os = new FileOutputStream(destination);
        int length;
        byte[] buffer = new byte[1024];
        while ((length = is.read(buffer)) != -1) {
            os.write(buffer, 0, length);
        }
        os.close();
        is.close();
    }
    
    public static void copyByReader(File source, File destination) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destination));
        String line ;
        while((line = br.readLine()) != null){
            line = line.trim();
            bw.write(line, 0, line.length());
        }
        bw.close();
        br.close();
    }
}
