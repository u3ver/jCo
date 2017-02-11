import java.util.Scanner;

class a8 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
     int a = sc.nextInt();
       System.out.println ("involutioning.. \n");
     int b = a * a;
       System.out.println ("^2: " + b);
     b = b * b;
       System.out.println ("^4: " + b);
     b = b * b;
       System.out.println ("^8: " + b);
  }
}