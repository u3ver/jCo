// if either evenly divides the other

import java.util.Scanner;

class Evenly {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
      int a = sc.nextInt();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      int b = sc2.nextInt();
    sc2.close();
    if (a % b == 0) {
      System.out.println ("True");
    } else if (b % a == 0) {
      System.out.println ("True");
    } else {
      System.out.println ("False");
    }
  }
}
