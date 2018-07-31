public class Animal {
    private String name;
    private String size;
    private String color;

    public Animal(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;

    }

    String printInformation() {
        return name + " " + "is" + " " + color + " " + "and" + " " + size;
    }

    public static void main(String[] args) {
        Animal ani1 = new Animal("owl", "small", "grey");
        Animal ani2 = new Animal("frog", "small", "green");
        Animal ani3 = new Animal("bear", "big", "brown");
        System.out.println(ani1.printInformation());
        System.out.println(ani2.printInformation());
        System.out.println(ani3.printInformation());
    }
}


