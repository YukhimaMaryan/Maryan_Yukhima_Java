package hw2;
import java.util.Scanner;
//1)Describe a class (Animal), use :
//- access and non-access (if need) modifiers
//2) Create a few methods (methods should print some information at list):
//- method 'go' with enter parameter like amount of steps
//- method 'say' with enter parameter what to say
//- method 'print Information' with nothing to enter, but must print all
//information about abject
//3) Create an Object of class Animal
public class Animal {
    private String name;
    private String size;
    private String color;

    public Animal(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;

    }

    String printInformation() {
        return name + " " + "is" + " " + color + " " + "and" + " " + size;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Say: ");//Enter from keyboard
        String say = in.nextLine();
        System.out.print("Go for: ");//Enter from keyboard
        int go = in.nextInt();
        System.out.print("Print number of the animal for info (owl[1], frog[2], bear[3]): ");//Enter from keyboard
        int choseanimal = in.nextInt();

        Animal ani1 = new Animal("owl", "small", "grey");
        Animal ani2 = new Animal("frog", "small", "green");
        Animal ani3 = new Animal("bear", "big", "brown");

        System.out.println("Go: " + go + " Say: " + say);
        if ( choseanimal == 1){
            System.out.println(ani1.printInformation());
        }
        if ( choseanimal == 2){
            System.out.println(ani2.printInformation());
        }
        if ( choseanimal == 3){
            System.out.println(ani3.printInformation());
        }

    }
}



