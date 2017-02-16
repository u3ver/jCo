import java.util.Scanner;

class Ex22 {
  public static void main (String[] args) {
    System.out.println ("enter constant from 10-99: ");
    Scanner sc = new Scanner(System.in);
      int xx = sc.nextInt();
    sc.close();
    
    int dec = xx / 10;
    int unit = xx % 10;
    int sum = dec + unit;
    int multi = dec * unit;
    System.out.println ("Sum: " + sum + ". Multiply: " + multi);
  }
}
