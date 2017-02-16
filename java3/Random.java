/* prints a random integer between a and b */

import java.util.Scanner;

class Random {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
      int a = sc.nextInt();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      int b = sc2.nextInt();
    sc2.close();
     System.out.println("Your enter:\na = " + a + "\nb = " + b);
     
    double c = b - a + 1;
      int random = (int)(Math.random() * c) + a;
    System.out.println (random);
  }
}
