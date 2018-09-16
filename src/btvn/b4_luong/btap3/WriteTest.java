package btvn.b4_luong.btap3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class WriteTest {

    public static void main(String[] args) {

        Vector<User> v = new Vector<>();
        v.add(new User("1", 1, "1", 1));   //first object
        v.add(new User("2", 2, "2", 2));   //2nd
        v.add(new User("3", 3, "3", 3));  //3rd
        v.add(new User("4", 4, "4", 4));  //4th

        //creat file and write these object to a file
        File f = new File("objectTest.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v);
            oos.close();
            System.out.println("data write successfully");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
