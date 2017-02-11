/* printing
 * A to B
 * B to A
*/

import java.util.Scanner;

class aBa {
public static void main(String[] args) {
  System.out.println ("Accepting nuclear launch codes..");
 Scanner sc = new Scanner(args[0]);
  int a = sc.nextInt();
 Scanner sc2 = new Scanner(args[1]);
  int b = sc2.nextInt();
 System.out.println ("A = " + a);
 System.out.println ("B = " + b);
 System.out.println ("Launching!"); 
   
    int aB;
    aB = a;
    a = b;
    b = aB;
    
 System.out.println ("A new = " + a);
 System.out.println ("B new = " + b);
 System.out.println ("Booyah!");
 }
}