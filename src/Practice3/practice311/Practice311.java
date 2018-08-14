package Practice3.practice311;
//Try to create file and write a string: "ELEKS QA Camp" in, then try to read attendant string from
import java.io.*;

public class Practice311 {
    public static void main(String args[]) throws IOException {
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("src/eleks.txt"));
        dataOut.writeUTF("Eleks QA Camp");
        DataInputStream dataIn = new DataInputStream(new FileInputStream("src/eleks.txt"));
        while (dataIn.available() > 0) {
            String k = dataIn.readUTF();
        }
    }




}
