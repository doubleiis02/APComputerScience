// Jiin Kim
// period 2
// 10/29/19

// Project C2p9

// Write an application that reads the radius of a sphere and prints its volume & surface area
// Use the following formulas:
// volume = 4/3*pi*r^3
// surface area = 4*pi*r^2
// Print the output to four decimal places

import java.util.Scanner;
import java.text.DecimalFormat;

public class C2p9
{
  public static void main(String[] args)
  {
    // declare & initialize objects
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.0000");
    
    // get radius
    System.out.print("Input radius: ");
    int r = input.nextInt();
    
    // caluclate volume & surface area
    double v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
    double sa = 4 * Math.PI * Math.pow(r, 2);
    
    // print volume & surface area
    System.out.println("Volume: " + df.format(v));
    System.out.println("Surface Area: " + df.format(sa));
  }
}
