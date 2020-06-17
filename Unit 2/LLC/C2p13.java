// Jiin Kim
// period 2
// 10/29/19

// Project C2p13

// Write an application that creates & prints a random phone # of the form XXX-XXX-XXX
// Include the dashes in the output
// Do not let the first three digits contain an 8 or 9
// Make sure the second set of three digits is not greater than 742

import java.text.DecimalFormat;

public class C2p13
{
  public static void main(String[] args)
  { 
    // declare & initialize new DecimalFormat object
    DecimalFormat df = new DecimalFormat("000");

    // first 3 digits
    int digits1 = (int)(Math.random() * 8) * 100 + (int)(Math.random() * 8) * 10 + (int)(Math.random() * 8);
    
    // second 3 digits
    int digits2 = (int)(Math.random() * 743);
    
    // third 3 digits
    int digits3 = (int)(Math.random() * 1000);
    
    // print random phone number
    System.out.print(df.format(digits1) + "-" + df.format(digits2) + "-" + df.format(digits3));
  }
}