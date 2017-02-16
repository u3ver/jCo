/* Write a program that takes three double values x, y, and z as command-line arguments
and prints true if the values are strictly ascending or descending (x < y < z or x > y > z),
and false otherwise. */

import java.util.Scanner;

class Asce {
  public static void main (String[] args) {
     Scanner sc = new Scanner(args[0]);
      double x = sc.nextDouble();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      double y = sc2.nextDouble();
    sc2.close();
    Scanner sc3 = new Scanner(args[2]);
      double z = sc3.nextDouble();
    sc3.close();
    System.out.println ("Values:\n x = " + x
                          + "\n y = " + y
                          + "\n z = " + z);
    
    if ( x < y && y < z && z > x) {
        System.out.println ("true ascending");
    }  else if ( x > y && y > z && z < x) {
        System.out.println ("true descending");  
    }  else {
      System.out.println ("false");
    }
  }
}
