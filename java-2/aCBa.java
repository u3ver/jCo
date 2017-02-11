/* printing
 * A to C
 * C to B
 * B to A
*/

import java.util.Scanner;

class aCBa {
public static void main(String[] args) {
  System.out.println ("Accepting nuclear launch coordinates..");
 Scanner sc = new Scanner(args[0]);
  int a = sc.nextInt();
 Scanner sc2 = new Scanner(args[1]);
  int b = sc2.nextInt();
  Scanner sc3 = new Scanner(args[2]);
  int c = sc3.nextInt();
 System.out.println ("A = " + a);
 System.out.println ("B = " + b);
 System.out.println ("C = " + c);
  System.out.println ("Setting up a new course.."); 
    int aC;
    aC = a;
    int bC;
    bC = b;
        
   a = c;
   c = aC;
   b = a;
   a = bC;
   
    
 System.out.println ("A new = " + a);
 System.out.println ("B new = " + b);
 System.out.println ("C new = " + c);
 System.out.println ("Booyah!");
 }
}