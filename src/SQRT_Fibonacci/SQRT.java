package SQRT_Fibonacci;
import java.util.Scanner;
public class SQRT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value:");
        int numb = in.nextInt();

        if (numb > 0) {
            System.out.println("sqrt(" + numb + ")=" + Math.sqrt(numb));
        } else {
            System.out.println("Value must be >0 " + numb);
        }
    }

}
