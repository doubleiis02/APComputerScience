// Jiin Kim
// period 2
// 10/29/19

// Project C2p4

// Create a revised version of the TempConverter application to convert from Fahrenheit to Celsius
// Read the Fahrenheit temperature from the user

import java.util.Scanner;

public class C2p4
{
  public static void main(String[] args)
  {
    // declare & initialize new variables needed
    Scanner input = new Scanner(System.in); 
    final int BASE = 32; // CONSTANT FOR BASE
    final double CONVERSION_FACTOR = 5.0/9;
    boolean isHot = false;
    boolean isCold = false;
    
    // get the user input
    System.out.print("Input Fahrenheit Temperature: ");
    int fahrenheitTemp = input.nextInt();
    
    // calculate results
    double celsiusTemp = (fahrenheitTemp - BASE) * (CONVERSION_FACTOR);
    
    // output the results
    System.out.println("Fahrenheit Value: " + fahrenheitTemp);
    System.out.println("Celsius Value: " + celsiusTemp);
    
    if (fahrenheitTemp >= 80)
      isHot = true;
    
    if (fahrenheitTemp <= 60)
      isCold = true;
    String hot = isHot ? "It is hot!" : "It's not hot";
    String cold = isCold ? "It is cold!" : "It's not cold";
    System.out.println(hot);
    System.out.println(cold);
  }
}