// Jiin Kim
// Period 2
// 8/29/19

// Greetings2 project
// getting user input

import java.util.Scanner;
public class Greetings2
{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  
  // ask user for input
  System.out.print("Enter your first name: ");
  String first = input.nextLine();
  System.out.print("Enter your last name: ");
  String last = input.nextLine();
  
  System.out.print("Hello, " + first + " " + last + "!");
  System.out.print("Welcome to Java!");
  
  input.close();
 }
}