/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn.lamviecvoifile;

import java.io.File;
import java.util.Scanner;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author kien vu
 */
public class B3 {

    public static void main(String[] args) {
        System.out.println("Nhap ten file can tim kiem : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File[] paths;
        FileSystemView fsv = FileSystemView.getFileSystemView();

        paths = fsv.getRoots();
        int count = searchFile(paths, 0, str.trim());
        if (count == 0) {
            System.out.println("Khong tim thay file");
        }
    }

    public static int searchFile(File[] files, int level, String str) {
        int count = 0;
        for (File file : files) {
            // Hien thi muc file trong cay phan cap thu muc
//            for (int i = 0; i < level; i++) {
//                System.out.print("\t");
//            }
            // Tim kiem file
            if (file.isFile()) {
                if (B2.getNameFile(file).equalsIgnoreCase(str)) {
                    System.out.println(file.getPath());
                    count++;
                }
            } else if (file.isDirectory()) {
                // Neu la thu muc thi tiep tuc tim kiem file trong thu muc do
                searchFile(file.listFiles(), level + 1, str);
            }
        }
        return count;
    }
}
