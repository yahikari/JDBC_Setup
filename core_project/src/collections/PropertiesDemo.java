package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis= new FileInputStream("D:\\Spring Boot Project\\core_project\\src\\collections\\myproject.properties");
            Properties prop=new Properties();
            prop.load(fis);

           // System.out.println(prop.getProperty("server.username"));

            Set<Object> keySet=prop.keySet();

            for (Object key: keySet){
                System.out.println(key +"------"+prop.get(key));
            }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
