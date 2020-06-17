// Jiin Kim
// period 2
// 10/29/19

// Project C2p10

// Write an application that reads the lengths of the side of a triangle from the user
// Compute the area of the triangle using Heron's formula
// area = sqrt(s * (s-a) * (s-b)) * (s-c)
// s = half the perimeter of the triangle
// a, b, & c are lengths of the three sides
// Print the area to three decimal places

import java.util.Scanner;
import java.text.DecimalFormat;

public class C2p10
{
  public static void main(String[] args)
  {
    // declare & intialize objects
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.000");
    
    // get sides
    System.out.print("Length of first side: ");
    int a = input.nextInt();
    System.out.print("\nLength of second side: ");
    int b = input.nextInt();
    System.out.print("\nLength of third side: ");
    int c = input.nextInt();
    
    // calculate s
    double s = (a + b + c) / 2.0;
    
    // calculate area
    double area = (s-c) * Math.sqrt(s * (s-a) * (s-b));
    
    // print area 
    System.out.println("Area of triangle: " + df.format(area));
  }
}