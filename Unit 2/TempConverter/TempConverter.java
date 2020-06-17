// Jiin Kim
// period 2
// 10/29/19

// create a class which converts celsius to Fahrenheit

// F = (9/5)C + 32

import java.util.Scanner; // Scanner gets input from user

public class TempConverter
{
  public static void main(String[] args)
  {
   // declare & initialize new variables needed
   Scanner input = new Scanner(System.in); 
   final int BASE = 32; // CONSTANT FOR BASE
   final double CONVERSION_FACTOR = 9.0/5;
   boolean isHot = false;
   boolean isCold = false;
   
   // get the user input
   System.out.print("Input Celsius Temperature: ");
   int celsiusTemp = input.nextInt();
   
   // calculate results
   double fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
   
   // output the results
   System.out.println("Celsius Value: " + celsiusTemp);
   System.out.println("Fahrenheit Value: " + fahrenheitTemp);
   
   
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