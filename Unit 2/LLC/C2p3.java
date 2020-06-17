// Jiin Kim
// period 2
// 10/29/19

// Project C2p3

// Write an application that reads two floating point numbers 
// and prints their sum, difference, and product

import java.util.Scanner;

public class C2p3
{
  public static void main(String[] args)
  {
    // initialize & declare new Scanner object
    Scanner input = new Scanner(System.in); 
    
    // get first floating point number
    System.out.print("Input first floating point number: ");
    double n1 = input.nextDouble();
    
    // get second floating point number
    System.out.print("\nInput second floating point number: ");
    double n2 = input.nextDouble();
    
    // calculate sum
    double sum = n1 + n2;
    
    // calculate difference
    double diff = n1 - n2;
    
    // calculate product
    double prod = n1 * n2;
    
    // print sum, difference, and product
    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + diff);
    System.out.println("Product: " + prod);
  }
}