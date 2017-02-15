/* printing
 * A to B
 * B to C
 * C to A
*/

import java.util.Scanner;

class ABCA {
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
    int aB;
    aB = a;
    int bC;
    bC = c;
        
    a = b;
    b = bC;
    c = a;
    b = aB;
    a = bC;
    
 System.out.println ("A new = " + a);
 System.out.println ("B new = " + b);
 System.out.println ("C new = " + c);
 System.out.println ("Booyah!");
 }
}
