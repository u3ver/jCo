import java.util.Scanner;

class Ex21 {
  public static void main (String[] args) {
    System.out.println ("enter constant from 10-99: ");
    Scanner sc = new Scanner(System.in);
      int xx = sc.nextInt();
    sc.close();
    
    int dec = xx / 10;
    int unit = xx % 10;
      System.out.println (dec);
      System.out.println (unit);
  }
}
