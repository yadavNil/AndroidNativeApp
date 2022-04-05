package android.app.utils.core;

import java.io.*;
import java.util.Properties;

public class ProperitesFiles extends BaseTest
{
   // public static Properties prop = new Properties();
   // File file = new File("D:\\Nilesh_Appium_Project\\AndroidNativeApp\\src\\main\\resources\\config\\config.properties");

    static Properties prop;

    public static void load_property_file() throws IOException
    {
        prop=new Properties();

        try {
            //String path=System.getProperty("user.dir")+"\\config.properties";
            InputStream input=new FileInputStream("D:\\Nilesh_Appium_Project\\AndroidNativeApp\\src\\main\\resources\\config\\config.properties");
           // InputStream input=new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
            prop.load(input);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

    public static String getObject(String Data) throws IOException
    {
        load_property_file();
        String data= prop.getProperty(Data);
        return data;
    }

}
