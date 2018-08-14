package Practice3.practice312;

import java.io.Serializable;
//Create an object Human with age and name like states, try to write and read object of current class
//into file and vise versa in java


    public class Human implements Serializable  {

        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public Human() {
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
