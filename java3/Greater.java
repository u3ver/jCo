/* prints true if any of them is strictly greater
 * than the sum of the other two and false otherwise */

import java.util.Scanner;

class Greater {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
      int a = sc.nextInt();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      int b = sc2.nextInt();
    sc2.close();
    Scanner sc3 = new Scanner(args[2]);
      int c = sc3.nextInt();
    sc3.close();
    System.out.println("Your enter:\na = " + a + "\nb = " + b + "\nc = " + c);
    
      if ( c > (a + b) ) {
        System.out.println (c +" true. c is greater rather the sum of a+b");
    } else if ( a > (c + b) ) {
        System.out.println (a +" true. a is greater rather the sum of c+b");
    } else if ( b > (a + c) ) {
        System.out.println (b + "true. b is greater rather the sum of a+c");
    } else {
      System.out.println ("FALSE");
    }
  }
}
