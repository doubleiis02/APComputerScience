// Jiin Kim
// period 2
// 12/16/19

import java.util.*;

public class StringToNum
{
  public static void main(String[] args)
  {
    String username;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your student ID: "); // school id example
    username = input.nextLine();
    
    // the global apocalypse is going to occur in 2038....
    // how many years after your graduation willl you have till the apocalypse?
    // no loops!
    
    int grad = Integer.parseInt(username.substring(0, 2));
    int yrs = 38 - grad;
    System.out.println("You have " + yrs + " years left after your graduation until the apocalypse occurs");
  }
  
}