import java.util.Scanner;

class RGB {
  public static void main (String[] args) {
    Scanner sc = new Scanner(args[0]);
      double r = sc.nextDouble();
    sc.close();
    Scanner sc2 = new Scanner(args[1]);
      double g = sc2.nextDouble();
    sc2.close();
    Scanner sc3 = new Scanner(args[2]);
      double b = sc3.nextDouble();
    sc3.close();
    
    double red = (r / 255);
    double green = (g / 255);
    double blue = (b / 255);
    
   // CONVERTING TO CMYK 
    
    double wh = Math.max(red, Math.max(blue, green));
    
    double c = (wh - red) / wh;
     c = c * 1000;
     c = (double)((int)c);
     c = c / 1000;
    
     double m = (wh - green) / wh;
     m = m * 1000;
     m = (double)((int)m);
     m = m / 1000;
    
     double y = (wh - blue) / wh;
     y = y * 1000;
     y = (double)((int)y);
     y = y / 1000;
   
     double bl = (1 - wh);
     bl = bl * 1000;
     bl = (double)((int)bl);
     bl = bl / 1000;
     
    System.out.println ("You entered RGB pattern: " + (int)r + " " + (int)g + " " + (int)b);
    
    System.out.println ("Converted to CMYK:\nC = " + c + "\nM = " + m + "\nY = " + y + "\nK = " + bl);
  }
}
