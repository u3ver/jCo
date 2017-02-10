import java.util.Scanner;
// import java.io.*; not needed

public class Scan2in {
  public static void main (String[] args)  {
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
