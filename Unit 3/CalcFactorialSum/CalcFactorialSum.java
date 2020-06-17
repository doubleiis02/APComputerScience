// Jiin Kim
// period 2
// 12/16/19

// Write a program that produces the following outpit: 
  // Enter a positive integer under 10: 6
  // output: 1+2+3+4+5+6 = 21

// make sure the user cannot enter a number that is not 1-9

import java.util.*;

public class CalcFactorialSum
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = 1, sum = 0;
    System.out.print("Enter a number between 1 - 9: ");
    
    do
    {
      if (n < 1 || n > 9)
        System.out.print("Try again: ");
      n = input.nextInt();
    }while (n < 1 || n > 9);
    
    for (int i = 1; i <= n; i++)
    {
      sum += i;
    }
    
    System.out.println("The sum of all integers from 1 to " + n + " is " + sum);
  }
}