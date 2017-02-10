import java.util.Scanner;
import java.io.*;
  
class args0 {
  public static void main (String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner((new File(args[0])));
    String arg = sc.next();
    sc.close();
    System.out.println (arg);
  }
}

// console java args0 x y z > / >> reportARGS.txt
