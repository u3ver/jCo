import java.util.Scanner;
import java.io.*;

public class Scan2in {
  public static void main (String[] args) throws FileNotFoundException
  {
    Scanner sc = new Scanner(System.in); {
    System.out.println("Reading file.."); 
    while (sc.hasNext()) {
      System.out.println ("Found: " + sc.next());
    }
    System.out.println ("bye");
    sc.close();
    }
  }
}