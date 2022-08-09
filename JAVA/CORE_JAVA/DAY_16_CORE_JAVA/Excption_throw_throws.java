
package DAY_16_CORE_JAVA;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excption_throw_throws {
    public static void CheckForFile() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("abc.txt");
    }
    public static void main(String[] args) throws FileNotFoundException {
        Excption_throw_throws exception_throw_throws=new Excption_throw_throws();
        try{
        Excption_throw_throws.CheckForFile();

    }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        }
}
