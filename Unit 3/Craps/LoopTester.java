// Jiin Kim
// period 2
// 12/5/19

// LoopTester

public class LoopTester
{
  public static void main(String[] args)
  {
    //printNum();
    //System.out.println("");
    //printOddNum();
    //printNumBlock();
    printStars();
  }
  
  // create a loop which prints numbers 1 to 20
  public static void printNum()
  {
    for (int i = 1; i <= 20; i++)
      System.out.println(i);
  }
  
  // print odd numbers
  public static void printOddNum()
  {
    for (int i = 1; i <= 20; i+=2)
      System.out.println(i);
  }
  
  // print 20 numbers of 5 per line
  public static void printNumBlock()
  {
    for (int i = 1; i <= 20; i++)
    {
      if (i < 10)
        System.out.print("0" + i + " "); // could also use "\t" for tab
      else
        System.out.print(i + " ");
      if (i % 5 == 0)
        System.out.print("\n");
    }
  }
  
  // lines of asterisks from 1 to 10
  public static void printStars()
  {
    String s = "";
    for (int i = 1; i <= 10; i++)
    {
      s += "*";
      System.out.println(s);
    }
    
    // another method
    for (int row = 1; row <= 10; row++)
    {
      for (int star = 1; star <= row; star++)
        System.out.print("*");
      System.out.print("\n");
    }
    
  }
  
}