/* Дни недели пронумерованы следующим образом:
 * 1 — понедельник, 2 — вторник, …, 6 — суббота, 7 — воскресенье.
 * Дано целое число K, лежащее в диапазоне 1–365.
 * Определить номер дня недели для K-го дня года, если известно,
 * что в этом году 1 января было средой.
 * 
 * Дано целое положительное число.
 * Проверить истинность высказывания: «Данное число является нечетным трехзначным».
*/

import java.util.Scanner;

class Ex27 {
  public static void main (String[] args) {
    System.out.println ("Enter day number 1- 365:");
    Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
    sc.close();
    
    if (k >= 1 && k <=365) {
           System.out.println ("Day number: " + k);
       
      int wd; 
      wd = (k - 1) % 7;
    
   switch (wd) {
      case 4: System.out.println ("Sunday");
       break;
      case 5: System.out.println ("Monday");
       break;
      case 6: System.out.println ("Tuesday");
       break;
      case 0: System.out.println ("Wednesday");
       break;
      case 1: System.out.println ("Thursday");
       break;
      case 2: System.out.println ("Friday");
       break;
      case 3: System.out.println ("Saturday");
       break;
    default: System.out.println ("Wrong input");
                }
    } else {
        System.out.println ("Wrong day number");
           }
    
    System.out.println ("\n");
    
    boolean kk;
    
    if ( kk = (k % 2 != 0)) {
        System.out.println (""+k+" is odd' " + kk);
    } else {
      kk = false;
      System.out.println ("An expression "+k+" is odd' is " + kk);
    }
    
    if (kk = (k < 1000 && k > 99)) {
        System.out.println ("An expression "+k+" contains three digits' is " + kk);
    } else {
      kk = false;
        System.out.println ("An expression "+k+" contains three digits' is " + kk);
    }
  }
}
