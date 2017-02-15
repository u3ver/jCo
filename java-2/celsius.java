import java.util.Scanner;
// import java.math.BigDecimal; // for rounding 0.00

class celsius {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
     double c = sc.nextDouble();
     double f;
     f = c * 1.8 + 32;
     f = f * 100;
     f = (double)((int)f);
     f = f / 100;
     //BigDecimal fDec = new BigDecimal(f); // call the rounding 
     //fDec = fDec.setScale(2, BigDecimal.ROUND_HALF_UP); // setting scale to 2numbers after dot + necessary rounding method!!
  System.out.println ("temperature aboard: " + c + "C.\nin Fahrenheit: " + f + "F");
  }
}
