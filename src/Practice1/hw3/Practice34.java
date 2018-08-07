package Practice1.hw3;
//Create three methods: 1. startPrint() - should print: "Start printing user credentials"
//(use annotation @Before with), 2. printUserCredentials() - should print all
//credential of priviusly created users roles (use annotation @Test with), 3.
//finishPrint() - should print: “Finish printing user credentials" (use annotation @After
//with)
public class Practice34 {
    public enum User {
        AGRONOMIST("Joe Cash", "12345"),
        ACCOUNTANT("Suzy May", "32451"),
        DIRECTOR("Jack Smith", "54321");

        private String name;
        private String code;

        private User(String name, String code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }


        @Deprecated
        public void startPrint() {
            String startPrint =  "Start printing cridentials:";
            System.out.println(startPrint);
        }

        public static void main(String[] args) {
            for (User s : User.values())
                System.out.println(s + ": " + s.getName() + " " + s.getCode());
        }

        @Deprecated
        public void finishPrint() {
            String finishPrint = "Finish printing cridentials:";
            System.out.println(finishPrint);
        }
    }
}





