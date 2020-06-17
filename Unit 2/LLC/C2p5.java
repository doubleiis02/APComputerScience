// Jiin Kim
// period 2
// 10/29/19

// Project C2p5

// Write an application that converts miles to kilometers (One mile = 1.60935 kilometers)
// Read the miles value from the user as a floating point value

import java.util.Scanner;

public class C2p5
{
  public static void main(String[] args)
  {
    // initialize & declare variables / objects
    Scanner input = new Scanner(System.in);
    final double CONVERSION = 1.60935;
    
    // get miles value
    System.out.print("Input miles as a floating point value: ");
    double miles = input.nextDouble();
    
    // calculate km 
    double km = miles / CONVERSION;
    
    // output miles and km
    System.out.println("Miles: " + miles);
    System.out.println("Kilometers: " + km);
  }
}