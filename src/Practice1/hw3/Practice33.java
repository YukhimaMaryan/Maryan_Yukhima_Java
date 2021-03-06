package Practice1.hw3;
//Create "class enum" User, create a few user roles inside, every enum must have
//two parameters: 1. user name, 2. user pass
public class Practice33 {
    public enum User {
        USERAG("agronomist", "12345"),
        USERAC("accountant", "32451"),
        USERDIR("director", "54321");

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
    }

    ;

    public static void main(String[] args) {
        for (User s : User.values())
            System.out.println(s + ": " + s.getName() + " " + s.getCode());
    }
}

