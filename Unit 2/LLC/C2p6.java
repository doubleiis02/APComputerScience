// Jiin Kim
// period 2
// 10/29/19

// Project C2p6

// Write an application that reads values representing a time in hours, minutes, & seconds
// Then print the same time in seconds
// (For example, 1 hour, 28 minutes, and 42 seconds = 5322 seconds)

import java.util.Scanner;

public class C2p6
{
  public static void main(String[] args)
  {
    // declare & initialize new Scanner object
    Scanner input = new Scanner(System.in);
    
    // get hours, minutes, and seconds
    System.out.println("Input amount of time as hours, minutes, and seconds.");
    System.out.print("Input hours: ");
    int hrs = input.nextInt();
    System.out.print("\nInput minutes: ");
    int mins = input.nextInt();
    System.out.print("\nInput seconds: ");
    int secs = input.nextInt();
    
    // calculate seconds
    int totalsecs = secs + mins * 60 + hrs * 3600;
    
    // output total seconds
    System.out.println("Time in total number of seconds: " + totalsecs);
  }
}