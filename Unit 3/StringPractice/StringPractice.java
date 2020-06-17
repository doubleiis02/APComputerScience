// Jiin Kim
// period 2
// 12/10/19

// String Practice

import java.util.Scanner;

public class StringPractice
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String s = "";
    s = "helloooo";
    String s1 = new String("\n\t\tgoodbyeeee");
    String s2 = "\n\t\t\t\t\t\t\t\t\t\tcan you see this";
    String poem = s + s1 + s2;
    
    System.out.println(poem);
    
    int location = poem.indexOf("good");
    System.out.println("position of \"good\": " + location);
    // call a substring from the position of the text "you"
    System.out.println(poem.substring(poem.indexOf("you")));
  }
}