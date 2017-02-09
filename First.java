import java.util.Scanner;
import java.io.*;

public class First {
  public static void scanner() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("1.txt"));
    System.out.println("Reading file..");
        
         //read file line by line
        sc.useDelimiter(System.getProperty("line.separator")); // learn: delimiter + System.getProperty
        
        while(sc.hasNext()) {
          System.out.println ("completed: " + sc.next());
          }
         sc.close();
  }
    public static void main (String[] args) throws IOException { // ??? зачем
      scanner();
    }
}
