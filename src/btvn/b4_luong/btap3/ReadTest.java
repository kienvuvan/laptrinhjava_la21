package btvn.b4_luong.btap3;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Vector;

public class ReadTest {

    public static void main(String[] args) {
        
            File f = new File("objectTest.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
//            ois.readObject();
//            ois.close();
            
            Vector<User> deserializeStudent = (Vector<User>)ois.readObject();
            System.out.println(deserializeStudent);
            ois.close();
            
            Iterator<User> iter = deserializeStudent.iterator();
            while(iter.hasNext()){
                User s = iter.next();
                System.out.println(
                        "ID: " + s.getUser() + ", "
                        + "Name: " + s.getAddress() + ", "
                        + "Mark: " + s.getAge()
                );
            }
            
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }      
    }
}
