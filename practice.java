import java.util.Scanner;

class practice {
public static void main(String[] args) {
 Scanner sc = new Scanner(args[0]);
 int a = sc.nextInt();
 Scanner sc2 = new Scanner(args[1]);
 int b = sc2.nextInt();
 System.out.println ("A = " + a);
 System.out.println ("B = " + b);
 int aB = a;
 a = b;
 b = aB;
 System.out.println ("A new = " + a);
 System.out.println ("B new = " + b);
}
}