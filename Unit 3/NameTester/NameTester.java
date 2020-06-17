// Jiin Kim
// period 2
// 12/12/19
import java.util.Scanner;
public class NameTester
{
  public static void main(String[] args)
  {
    String n, name, fName, lName, initials, backwards = "";
    int len;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Type in your name (first last)");
    
    n = input.nextLine().trim(); // full name entered & trimmed
    
    // making sure the name is capitalized
    name = Character.toUpperCase(n.charAt(0)) + n.substring(1, n.indexOf(" ") + 1);
    name += Character.toUpperCase(n.charAt(n.indexOf(" ")+1)) + n.substring(n.indexOf(" ")+2);
    
    fName = name.substring(0, name.indexOf(" "));
    lName = name.substring(name.indexOf(" ") + 1);
    initials = fName.charAt(0) + "." + lName.charAt(0) + ".";
    len = name.length() - 1;
    
    int i = len; // len = name.length() - 1;
    while (i >= 0)
    {
      backwards += name.charAt(i);
      i--;
    }
    
    System.out.println("Full name: " + name);
    System.out.println("Number of letters: " + len);
    System.out.println("First name: " + fName);
    System.out.println("Last name: " + lName);
    System.out.println("Initials: " + initials);
    System.out.println("Backwards: " + backwards);
    
  }
}