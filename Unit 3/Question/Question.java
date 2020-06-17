// Jiin Kim
// period 2
// 12/12/19

// Question class

import java.util.Scanner;

public class Question
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String question = "What are your favorite hobbies? (type STOP to quit)";
    String answer = "", hobbies = "";
    
    System.out.println(question);
    do
    {
      answer = input.nextLine();
      if (!answer.equalsIgnoreCase("stop"))
      {
        if (!hobbies.equals(""))
          hobbies += ", ";
        hobbies += answer;
      }
    } while (!answer.equalsIgnoreCase("stop"));
    
    System.out.println(hobbies);
    
    
  }
}