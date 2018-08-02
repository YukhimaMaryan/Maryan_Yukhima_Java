package hw1;
//print you name each sumbol in new line(using WHILE loop and
//string methods chartAt(), length())
public class Practical7 {
    public static void main(String[] args) {
        String name = "Marian";
        int i = 0;
        while (i < name.length()) {
            System.out.println(name.charAt(i++));
        }
    }
}
