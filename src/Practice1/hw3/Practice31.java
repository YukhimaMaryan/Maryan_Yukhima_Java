package Practice1.hw3;
//Create an array with random numbers inside, try to sort current array
import java.util.Arrays;

public class Practice31 {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20) - 10);
        }

        for (int i = 0; i < 10; i++) {
            Arrays.sort(array);
            System.out.println(array[i]);

        }
    }
}

