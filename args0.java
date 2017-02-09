import java.util.Scanner;

class args0 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
    String arg = sc.next();
    sc.close();
    System.out.println (arg);
  }
}

// console java args0 x y z > / >> reportARGS.txt