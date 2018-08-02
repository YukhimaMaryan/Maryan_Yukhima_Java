package hw4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers to print:");//Enter from keyboard number of fibanacci array lengh
        int numb = scanner.nextInt();
        int[] fibonaci = new int[numb];

        fibonaci[0] = 0;
        fibonaci[1] = 1;
        for (int i = 2; i < numb; ++i) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }
            for (int i = 0; i < numb; ++i) {
                System.out.println("Fibonacci:" + fibonaci[i]);
            }
        }
    }



