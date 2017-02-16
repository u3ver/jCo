// Why are the values not always exactly 1?

import java.util.Scanner;

class Sin {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
     int arg = sc.nextInt();
     double o = Math.sin(arg * arg) + Math.cos(arg * arg);
      System.out.println ("sin^2(" + arg + ") + cos^2(" + arg +") = " + o);
  }
}
