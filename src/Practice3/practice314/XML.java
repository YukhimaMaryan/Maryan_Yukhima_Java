package Practice3.practice314;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XML {

    private static final String FILE_NAME = "customer.xml";

    public static void main(String[] args) {
        Customer custm = new Customer();
        custm.setId(1);
        custm.setAge(27);
        custm.setName("Vasia");

        objectXML(custm);

        Customer cusFromFile = jaxbXMLToObject();
        System.out.println(cusFromFile.toString());
    }


    private static Customer jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Unmarshaller un = context.createUnmarshaller();
            Customer custm = (Customer) un.unmarshal(new File(FILE_NAME));
            return custm;
        } catch (JAXBException c) {
            c.printStackTrace();
        }
        return null;
    }


    private static void objectXML(Customer custm) {

        try {
            JAXBContext context = JAXBContext.newInstance(Customer.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // Write to File
            m.marshal(custm, new File(FILE_NAME));
        } catch (JAXBException c) {
            c.printStackTrace();
        }
    }

}