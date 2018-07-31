import java.util.ArrayList;
import java.util.Collections;

public class Practice32 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(-3);
        list.add(21);
        list.add(8);

        Collections.sort(list);
        System.out.println(list);

    }
}