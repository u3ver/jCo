import java.util.Scanner;

class Loop {
  public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    for (; n % 2 != 0;) {
       System.out.println ("ODD");
       break; }
    for (; n % 2 == 0;) {
        System.out.println ("EVEN");
       break; }
  }
}
