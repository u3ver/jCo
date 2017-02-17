import java.util.Scanner;

class Ex210 {
  public static void main (String[] args) {
 System.out.println ("enter digit from 100-999: ");
    Scanner sc = new Scanner(System.in);
      int xxx = sc.nextInt();
    sc.close();
    
    int thou = xxx / 100;
    int dec = (xxx / 10) % 10;
    int unit = (xxx % 10);
    
    int sum = thou + dec + unit;
    int multi = thou * dec * unit;
    
    System.out.println ("Sum of digits: " + sum + ". Multiply: " + multi);
  }
}
