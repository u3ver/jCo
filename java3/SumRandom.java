/* Write a program that prints the sum of two random integers
 * between 1 and 6 (such as you might get when rolling dice).
 */

import java.util.Scanner;

class SumRandom {
  public static void main (String[] args) {
    int a, b;
    a = 1;
    b = 6;
    double c = b - a + 1;
    int random = (int)(Math.random() * c) + a;
    int random2 = (int)(Math.random() * c) + a;
    int sumRandom = random + random2;
    System.out.println ("First random - " + random);
    System.out.println ("Second random - " + random2);
    System.out.println ("Sum of randoms - " + sumRandom);
  }
}
