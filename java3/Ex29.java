import java.util.Scanner;

class Test {
  public static void main (String[] args) {
    System.out.println ("enter digit from 1000-9999: ");
    Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
    sc.close();
    
    int thou = x / 1000;
    int hund = (x / 100) % 10;
    int dec = (x / 10) % 10;
    int unit = x % 10;
    
    //System.out.println (thou);
    //System.out.println (hund);
    //System.out.println (dec);
    //System.out.println (unit);
    
    boolean q;
    if ( q = (thou + hund == dec + unit)) {
    } else {
        q = false;
    }
        System.out.println ("Palindrome? " + q);
  }
}
