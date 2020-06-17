// Jiin Kim
// period 2
// 10/29/19

// Project C2p12

// Write an application that determines the value of the coins in a jar
// Print the total in dollars and cents
// Read integer values that represent the number of quarters, dimes, nickels, and pennies
// Use a currency formatter to print the ouput

import java.util.Scanner;
import java.text.DecimalFormat;

public class C2p12
{
  public static void main(String[] args)
  {
    // declare & initialize objects
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    
    // read quarters, dimes, nickels, and pennies
    System.out.print("Input number of quarters: ");
    int quarters = input.nextInt();
    System.out.print("\nInput number of dimes: ");
    int dimes = input.nextInt();
    System.out.print("\nInput number of nickels: ");
    int nickels = input.nextInt();
    System.out.print("\nInput number of pennies: ");
    int pennies = input.nextInt();
    
    // calculate total
    double total = quarters * .25 + dimes * .1 + nickels * .05 + pennies * .01;
    
    // print total
    System.out.println("Total amount of money = $" + df.format(total));
  }
}