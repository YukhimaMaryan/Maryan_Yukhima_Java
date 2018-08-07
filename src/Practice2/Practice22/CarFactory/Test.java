package Practice2.Practice22.CarFactory;

import java.util.Scanner;

//Task 3. Assume you are car maker. Implement factory method for different car class. Method receives key like
//“sedan”, “hatchback”, “mini”, “limousine”, “suv”, etc and builds a car of specified class
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Car number: sedan[1], Limusine[2], mini[3], hatchback[4], SUV[5]");//Enter from keyboard
        int numb = in.nextInt();

        if (numb==1) {
            System.out.println(CarFactory.buildCar(CarType.sedan));
        }
        if (numb==2) {
            System.out.println(CarFactory.buildCar(CarType.Limusine));
        }
        if (numb==3) {
            System.out.println(CarFactory.buildCar(CarType.mini));
        }
        if (numb==4) {
            System.out.println(CarFactory.buildCar(CarType.hatchback));
        }
        if (numb==5) {
            System.out.println(CarFactory.buildCar(CarType.SUV));
        }
        }
    }

