import java.util.Scanner;
import java.io.*;

public class Scanner2 {
  public static void main (String[] args) throws FileNotFoundException
  {
    Scanner sc = new Scanner(new File ("1.txt")); {
    System.out.println("Reading file.."); 
    while (sc.hasNext()) {
      System.out.println ("Found: " + sc.next());
    }
    System.out.println ("bye");
    sc.close();
    }
  }
}