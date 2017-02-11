/* printing
 * A to B
 * B to A
*/

import java.util.Scanner;

class ab {
public static void main(String[] args) {
  System.out.println ("Checking numbers..");
 Scanner sc = new Scanner(args[0]);
  int a = sc.nextInt();
 Scanner sc2 = new Scanner(args[1]);
  int b = sc2.nextInt();
 System.out.println ("A = " + a);
 System.out.println ("B = " + b + "\n");
 
    a = a + b;
    b = a - b;
    a = a - b;
    
     System.out.println ("Here you go. \n"); 
 System.out.println ("A new = " + a);
 System.out.println ("B new = " + b);
 System.out.println ("Bye!");
 }
}