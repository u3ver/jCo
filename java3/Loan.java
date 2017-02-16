/* Write a program that calculates the monthly payments you would have to make over a
given number of years to pay off a loan at a given interest rate compounded
continuously, taking the number of years t, the principal P, and the annual interest rate
r as command-line arguments. */

import java.util.Scanner;

class Loan {
  public static void main (String[] args) {
     Scanner sc = new Scanner(args[0]);
      double t = sc.nextDouble();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      double P = sc2.nextDouble();
    sc2.close();
    Scanner sc3 = new Scanner(args[2]);
      double r = sc3.nextDouble();
    sc3.close();
    System.out.println("Your enter:\n  number of years (t) = " + t
                         + "\n  the principal (P) = " + P
                         + "\n  the annual interest rate (r) = " + r + "%" + "\n");
              //           + "\n  Math.exp = " + Math.E 
    
      t = t * 12;
      double rt = r * t;
      double payment = P * Math.exp(rt);
        payment = payment * 100;
        payment = (double)((int)payment);
        payment = payment / 100;
          System.out.println ("  " + payment + "/month for " + (int)t + " months.");
  }
}
    
