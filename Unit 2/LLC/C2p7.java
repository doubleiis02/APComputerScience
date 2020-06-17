// Jiin Kim
// period 2
// 10/29/19

// Project C2p7

// Create a new version of C2p6 that works in reverse
// Read a value representing a number of seconds
// Then print the same amount of time in hours, minutes, and seconds

import java.util.Scanner;

public class C2p7
{
  public static void main(String[] args)
  {
    // declare & initialize new Scanner object
    Scanner input = new Scanner(System.in);
    
    // get total secs
    System.out.print("Input total number of seconds: ");
    int totalsecs = input.nextInt();
    
    // calculate time as hrs, mins, and secs
    int hrs = totalsecs / 3600;
    int mins = (totalsecs - hrs * 3600) / 60;
    int secs = totalsecs - hrs * 3600 - mins * 60;
    
    // print time as hrs, mins, and secs
    System.out.println("Hours: " + hrs);
    System.out.println("Minutes: " + mins);
    System.out.println("Seconds: " + secs);
  }
}