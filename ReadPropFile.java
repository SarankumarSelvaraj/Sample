
import java.io.FileInputStream;
import java.util.Properties;

class ReadPropFile {
  public static void main(String[] args) throws Exception {
    // create the file input stream object.
    FileInputStream fis = new FileInputStream("C:\\Users\\manoj\\Downloads\\Config.properties");
    // create the properties object.
    Properties prop = new Properties();
    prop.load(fis);
  // get the property values.
    String user = prop.getProperty("userName");
    String pass = prop.getProperty("password");
    String name = prop.getProperty("name");

    //print the values.
    System.out.println(user);
    System.out.println(pass);
    System.out.println(name);
  }
}