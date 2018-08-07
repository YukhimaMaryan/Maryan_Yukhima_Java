package Practice1.hw1;
//print you name each sumbol in new line(using FOR loop and
//string methods chartAt(), length())
public class Practical6 {
    public static void main(String[] args) {
        String name = "Marian Yukhima";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
