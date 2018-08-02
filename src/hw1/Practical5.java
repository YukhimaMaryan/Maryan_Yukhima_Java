package hw1;
//print variable less then 10(if it is true)
//or variable more then 10(if it is true)
import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number greater or less than 10: ");//Enter from keyboard
        int numb = in.nextInt();


        if (numb <= 10) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 10; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }
}

