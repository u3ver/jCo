import java.util.Scanner;

class Ex26 {
  public static void main (String[] args) {
    System.out.println ("enter the time in seconds: ");
    Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
    sc.close();
    
      int hour = N / 3600;
      int min = (N % 3600) / 60;
      int sec = N % 60;
      
        System.out.println ( hour + "h. " + min + "m. " + sec + "sec.");
  }
}
