import java.util.Scanner;
// import java.math.BigDecimal;

class Fahrenheit {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
     double f = sc.nextDouble();
     double c;
       c =  (f - 32) * 0.5556; // 5/9 = 0.555555556
    c = c * 100;
    c = (double)((int) c);
    c = c / 100;
         // BigDecimal cDec = new BigDecimal(c);
         // cDec = cDec.setScale(2, BigDecimal.ROUND_HALF_UP);
  System.out.println ("Temperature set to: " + f + " F.\n" + "Celsius: " + c + " C."); // + cDec
  }
}
