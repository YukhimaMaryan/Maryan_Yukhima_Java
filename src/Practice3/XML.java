package Practice3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XML {

    private static final String FILE_NAME = "jaxb-emp.xml";

    public static void main(String[] args) {
        Customer emp = new Customer();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Pankaj");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");

        jaxbObjectToXML(emp);

        Customer empFromFile = jaxbXMLToObject();
        System.out.println(empFromFile.toString());
    }


    private static Customer jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Unmarshaller un = context.createUnmarshaller();
            Customer emp = (Customer) un.unmarshal(new File(FILE_NAME));
            return emp;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void jaxbObjectToXML(Customer emp) {

        try {
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Marshaller m = context.createMarshaller();
            //for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Write to System.out for debugging
            // m.marshal(emp, System.out);

            // Write to File
            m.marshal(emp, new File(FILE_NAME));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}