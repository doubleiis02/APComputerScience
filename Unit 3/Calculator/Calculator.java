// Jiin Kim
// period 2
// 12/12/19

import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
    // write an authentication loop which gets a number from the user
    // between 1 and 10
    
    Scanner input = new Scanner(System.in);
    int n;
    System.out.println("Type a number between 1 to 10");
    do
    {
      n = input.nextInt();
    }while (n < 1 || n > 10);
    
    /*
    switch (n)
    {
      case 1:
        System.out.println("one");
        break;
      case 2:
        System.out.println("two");
        break;
      case 3:
        System.out.println("three");
        break;
      case 4:
        System.out.println("four");
        break;
      case 5:
        System.out.println("five");
        break;
      case 6:
        System.out.println("six");
        break;
      case 7:
        System.out.println("seven");
        break;
      case 8:
        System.out.println("eight");
        break;
      case 9:
        System.out.println("nine");
        break;
      case 10:
        System.out.println("ten");
    }
    */
  }
}