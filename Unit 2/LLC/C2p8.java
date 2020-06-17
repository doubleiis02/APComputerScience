// Jiin Kim
// period 2
// 10/29/19

// Project C2p8

// Write an application that reads the (x,y) coordinates for two pints
// Compute the distance between the two points using the following formula:
// distance = sqrt((x2 - x1 )**2 + (y2 - y1)**2)

import java.util.Scanner;

public class C2p8
{
  public static void main(String[] args)
  {
    // declare & initialize new Scanner object
    Scanner input = new Scanner(System.in);
    
    // get x & y
    System.out.print("Input x1: ");
    int x1 = input.nextInt();
    System.out.print("\nInput y1: ");
    int y1 = input.nextInt();
    System.out.print("\nInput x2: ");
    int x2 = input.nextInt();
    System.out.print("\nInput y2: ");
    int y2 = input.nextInt();
    
    // compute distance
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    
    // print distance
    System.out.println("The distance between the two points is " + distance);
  }
}