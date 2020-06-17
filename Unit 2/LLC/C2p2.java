// Jiin Kim
// period 2
// 10/29/19

// Project C2p2

// Write an application that reads three numbers and prints their average

import java.util.Scanner;

public class C2p2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in); // declaring & initializing Scanner object
    
    // take in first number
    System.out.print("Input first number: ");
    int n1 = input.nextInt();
    
    // take in second number
    System.out.print("\nInput second number: ");
    int n2 = input.nextInt();
    
    // take in third number
    System.out.print("\nInput third number: ");
    int n3 = input.nextInt();
    
    // calculate average
    double avg = (double)(n1 + n2 + n3) / 3;
    // print average
    System.out.println("Average: " + avg);
  }
}