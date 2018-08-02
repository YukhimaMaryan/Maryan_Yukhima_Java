package hw4;
import java.util.Scanner;
public class SQRT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value:");//Enter from keyboard
        int numb = in.nextInt();

        if (numb > 0) {
            System.out.println("sqrt(" + numb + ")=" + Math.sqrt(numb));
        } else {
            throw new RuntimeException ("Value must be >0 " + numb);
        }
    }

}

