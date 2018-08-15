package Practice3;
//Create an array of numbers, convert it to collection of List, using streams try to find min, max and
//average value of collection, also try to sort and filter collection

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice315 {

    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // IntStream.of or Arrays.stream, same output
        //List<Integer> list = IntStream.of(number).boxed().collect(Collectors.toList());

        List<Integer> list = Arrays.stream(number).boxed().collect(Collectors.toList());

        System.out.println("list : " + list);//list
        System.out.println(list.stream().max(Integer::compare).get());//max
        System.out.println(list.stream().min(Integer::compare).get());//min




    }
}
