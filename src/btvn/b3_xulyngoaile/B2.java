/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.b3_xulyngoaile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kien vu
 */
public class B2 {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            File file = new File("src/btvn/b3_xulyngoaile/test.dat");
            is = new FileInputStream(file);
            int size = is.available();
            for(int i=0;i<size;i++){
                System.out.print((char)is.read());
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(B2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(B2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(B2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
