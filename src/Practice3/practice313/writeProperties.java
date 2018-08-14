package Practice3.practice313;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
//Create properties file: "config.properties", set into properties for browser configuration like:
// "browser_name" and "brovser_version“
public class writeProperties {
        public static void main(String[] args) {

            Properties prop = new Properties();
            OutputStream output = null;

            try {

                output = new FileOutputStream("config.properties");

                // set the properties value
                prop.setProperty("browser_name", "chrome");
                prop.setProperty("brovser_version", "35");

                // save properties to project root folder
                prop.store(output, null);

            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

