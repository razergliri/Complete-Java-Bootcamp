import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        // this code will not compile! 
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally{
            System.out.println("Yahahah");
        }
        
    }

    public static void readFile() throws FileNotFoundException {
        // this will not compile!!
    FileInputStream fis = new FileInputStream("greetings.txt");
}

}
