/* Дано трехзначное число. 
 * Проверить истинность высказывания:
 * «Цифры данного числа образуют возрастающую последовательность».
 * 
 * Проверить истинность высказывания:
 * «Цифры данного числа образуют возрастающую
 * арифметическую последовательность», например, 123, 456 и т. п.
*/

import java.util.Scanner;

class Test {
  public static void main (String[] args) {
 System.out.println ("enter digit from 100-999: ");
    Scanner sc = new Scanner(System.in);
      int xxx = sc.nextInt();
    sc.close();
    
    int thou = xxx / 100;
    int dec = (xxx / 10) % 10;
    int unit = (xxx % 10);
    
    //System.out.println (thou);
    //System.out.println (dec);
    //System.out.println (unit);
    
    System.out.println ("Digits of your number form an increasing sequence:");
    
    boolean q;
    
    if ( q = (thou < dec && dec < unit) ) {
        System.out.print (q);
    } else {
      q = false;
      System.out.print (q);
    }
    
    System.out.println ("\n\nDigits of your number form an increasing arithmetic sequence:");
    
    if ( q = (dec - thou == 1) && unit - dec == 1) {
        System.out.println (q);
    } else {
      q = false;
        System.out.println (q);
    }
  }
}
