/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b4_luong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kien vu
 */
public class B1 {
    public static void main(String[] args) {
        int countLines = 0;
        int countWords = 0;
        int countChars = 0;
        FileInputStream fis = null;
        try {
            File file = new File("src/btvn/b4_luong/test.txt");
            fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line ;
            while((line = br.readLine()) != null){
                line = line.trim();
                if (line != null && !line.isEmpty()) {
                    System.out.println(line);
                    //Tang so luong dong len 1
                    countLines++;
                    String[] words = line.split(" ");
                    countWords += words.length;
                    countChars +=line.length();
                }
            }
            System.out.println("So luong dong : "+countLines);
            System.out.println("So luong tu : "+countWords);
            System.out.println("So luong ky tu :"+countChars);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(B1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(B1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(B1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String[] countWordInLine(String line){
        return line.split(" ");
    }
}
