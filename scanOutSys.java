import java.util.Scanner;
//import java.io.*;

class scanOutSys {
  public static void main (String[] args){ //throws IOException {
    //File out = new File("report.txt");
    //FileWriter fW = new FileWriter(out); // FileWriter creates or re existing output file
    //PrintWriter pW = new PrintWriter(fW); //PrintWriter writes println in it
  
  System.out.println("How would i call you?"); { // через консоль
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    scan.close();
    System.out.println ("Hi," + name + ". i don't like you. go away, " + name);
    //pW.println("Hi," + name + ". i like you. stay with me");
    //pW.close();
  }
  }
}