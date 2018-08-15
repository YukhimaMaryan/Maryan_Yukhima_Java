package Practice3.practice314;
//Create XML file: "Customer", try to write the object into file and also try to read it back to java
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "customer")
@XmlType(propOrder = {"id", "name", "age"})
public class Customer {

    private int id;
    private int age;
    private String name;


    @XmlAttribute
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID = " + id + " NAME=" + name + " AGE=" + age ;
    }

}