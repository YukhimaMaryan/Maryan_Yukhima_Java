package hw1;

import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
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

