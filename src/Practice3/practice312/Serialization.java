package Practice3.practice312;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {


        public static void main(String[] args) {

            try {
                Human mb = new Human("Vasia", 19);

                // write object to file
                FileOutputStream fos = new FileOutputStream("Human.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(mb);
                oos.close();

                // read object from file
                FileInputStream fis = new FileInputStream("Human.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Human result = (Human) ois.readObject();
                ois.close();

                System.out.println("Name:" + result.getName() + ", Age:" + result.getAge());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

