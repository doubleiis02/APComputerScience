// Jiin Kim
// 10/8/19
// Period 2

// runner for coin class

public class CoinRunner
{
  public static void main(String[] args)
  {
    //Coin c1 = new Coin(); // using a no-arg constructor
    Coin c1 = new Penny(); // polymorphism: Coin object can be any of Coin's subclasses
    Coin c2 = new Coin("tails", 10, "dime"); // using a constructor with parameters
    Coin c3 = new Nickel();
    Coin c4 = new Dime();
    Coin c5 = new Quarter();
    
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
 
    c1.flip();
    System.out.println("After a flip: " + c1);
    
    c1.flip();
    System.out.println("After a flip: " + c1);
    
    // test the flipping probability
    int counter = 0;
    for(int i = 0; i < 1000; i++)
    {
      c1.flip();
      if (c1.isHeads())
        counter++;
    }
    System.out.println("Total heads-up: " + counter + "/1000");
  }
}

// object has not been initialized -> null
// int hasn't been initialized -> 0