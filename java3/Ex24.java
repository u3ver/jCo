import java.util.Scanner;

class Ex24 {
  public static void main (String[] args) {
    System.out.println ("enter constant from 10-99: ");
    Scanner sc = new Scanner(System.in);
      int xx = sc.nextInt();
    sc.close();
      System.out.println ( ( (xx%10) * 10) + ( xx / 10 ));
  }
}
