// Jiin Kim
// period 2
// 10/29/19

// Project C2p11

// Write an application that computes the number of miles per gallon (mpg) of gas for a trip
// The total amount of gas used should be a floating point number
// Also accept two numbers representing the odometer readings at the start and end of the trip

import java.util.Scanner;

public class C2p11
{
  public static void main(String[] args)
  {
    // declare & intialize new Scanner object
    Scanner input = new Scanner(System.in);
    
    // get total amo of gas used
    System.out.print("Input total gallons of gas used during trip as a floating point number: ");
    double gallons = input.nextDouble();

    // get start & end odometer readings
    System.out.print("Input odometer reading at the start of trip: ");
    int start = input.nextInt();
    System.out.print("\nInput odometer reading at the end of trip: ");
    int end = input.nextInt();
    
    // computing
    int miles = end - start;
    double mpg = miles / gallons;
    
    // print mpg
    System.out.println("Miles per gallon for trip: " + mpg + " mpg");
  }
}