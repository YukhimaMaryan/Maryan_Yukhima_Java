package Practice2.practice21;
//1) Create abstract class Human with variable name and method sleep(print I sleep)
//        2) Create class Men and inherit him from Human
//3) Create interface iTalk with method talk(print I talk) and implement this interface in
//class Men
//4) In main method create object aragorn (new Men()) and call method sleep and talk
//        5) Override method sleep in class Men(should print I sleep one more time) and run
//        main method one more time.
public class Main {
    public static void main(String[] args) {
       Man a = new Man();
        Man aragorn = new Man();

        a.sleep();
        a.talk();
        aragorn.sleep();
        aragorn.talk();


    }

}
