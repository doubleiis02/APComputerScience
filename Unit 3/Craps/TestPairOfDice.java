// Jiin Kim
// period 2
// 12/3/19

// create a driver class called TestPairOfDice

public class TestPairOfDice
{
  public static void main(String[] args)
  {
    int rolls = 0;
    int snakeEyes = 0;
    int boxCars = 0;
    int dubs = 0;
    int sevenEleven = 0;
    PairOfDice pair = new PairOfDice();
    
    // every loop contains: initial value counter, conditional check, change counter
    
    /*
    int count = 0; // initial value counter
    while (count < 1000) // conditional check
    {
      pair.roll();
      rolls++;
      
      if (pair.isSnakeEyes())
        snakeEyes++;
      if (pair.isBoxCars())
        boxCars++;
      if (pair.isDouble())
        dubs++;
      if (pair.is7or11())
        sevenEleven++;
      
      count++; // change counter
    }
    */
    
    // for loop syntax
    // for(initialize counter; condition; change counter;)
    for (int i = 0; i < 1000; i++)
    {
      pair.roll();
      rolls++;
      
      if (pair.isSnakeEyes())
        snakeEyes++;
      if (pair.isBoxCars())
        boxCars++;
      if (pair.isDouble())
        dubs++;
      if (pair.is7or11())
        sevenEleven++;
    }
    
    // output
    System.out.println("\nTotals");
    System.out.println("***************************");
    System.out.println("Rolls: " + rolls);
    System.out.println("Snake Eyes: " + snakeEyes);
    System.out.println("Box Cars: " + boxCars);
    System.out.println("Doubles : " + dubs);
    System.out.println("7 or 11: " + sevenEleven);
  }
}