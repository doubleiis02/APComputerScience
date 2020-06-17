// Jiin Kim
// period 2
// 12/9/19

// StringTester project

import java.util.Scanner;

public class StringTester
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input String 1: ");
    String s1 = sc.nextLine();
    System.out.print("\nInput String 2: "); 
    String s2 = sc.nextLine();
    
    System.out.println(s1 + " == " + s2 + " : " + isEquals(s1, s2));
    
    System.out.print("\nEnter your name: ");
    String user = sc.nextLine();
    
    System.out.println("vowels in " + user + " : " + countVowels(user));
  }
  
  
  public static boolean isEquals(String s1, String s2)
  {
    // create a loop to check each character of each String
    // Strings always start at index 0
    s1 = s1.trim();
    s2 = s2.trim();
    if (s1.length() == s2.length())
    {
      for (int i = 0; i < s1.length(); i++)
      {
        if (s1.charAt(i) == s2.charAt(i))
          continue;
        return false;
      }
      return true;
    }
    return false;
  }
  
  public static int countVowels(String s)
  {
    // create a loop to check each character in user String variable to find # of vowels
    int v = 0;
    for (int i = 0; i < s.length(); i++)
    {
      // check the character and incrememt a counter if it's a vowel
      switch(s.charAt(i))
      {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': 
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          v++;
      }
    }
    return v;
  }
}