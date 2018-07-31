import java.util.Scanner;

public class practica22 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String say = in.nextLine();
        System.out.print("Enter Distance: ");
        int go = in.nextInt();


        System.out.println("Go: " + go + " Say: " + say);
    }
}

