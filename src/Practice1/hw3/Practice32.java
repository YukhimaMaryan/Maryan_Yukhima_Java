package Practice1.hw3;
//Create some collection with implementation of List interface, also with random
//numbers inside, try to sort current collection
import java.util.ArrayList;
import java.util.Collections;

public class Practice32 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        number1 = ((int) (Math.random() * 100) - 10);
        number2 = ((int) (Math.random() * 0) - 0);
        number3 = ((int) (Math.random() * 20) - 10);
        number4 = ((int) (Math.random() * 45) - 2);
        number5 = ((int) (Math.random() * 1) - 10);

        list.add(number1);
        list.add(number2);
        list.add(number3);
        list.add(number4);
        list.add(number5);

        Collections.sort(list);
        System.out.println(list);

    }
}