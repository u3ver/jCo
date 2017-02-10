import java.util.Scanner;
import java.io.*;
  
class args0 {
  public static void main (String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner((new File(args[0])));
    while (sc.hasNext()) {
    String arg = sc.next();
    System.out.println (arg);
    }
    sc.close();
  }
}

// console java args0 x y >/>> reportARGS.txt
