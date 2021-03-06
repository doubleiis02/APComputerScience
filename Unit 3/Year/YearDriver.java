// Jiin Kim
// period 2
// 11/14/19

// Driver class for Year

import java.util.Scanner;

public class YearDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int y;
    
    System.out.println("Test Year class");
    
    do
    {
      System.out.print("\nEnter a year (type 0 to quit): ");
      y = sc.nextInt();
      Year year = new Year(y);
      if (y != 0)
      {
        if (year.isLeapYear())
          System.out.println(year.getYear() + " is a valid leap year");
        else
          System.out.println(year.getYear() + " is NOT a valid leap year");
      }
    }while(y>0);
    System.out.println("bye");
  }
}