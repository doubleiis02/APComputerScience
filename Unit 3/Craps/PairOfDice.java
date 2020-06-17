// Jiin Kim
// period 2
// 12/3/19

// create a class called PairOfDice

public class PairOfDice
{
  // instance fields die1, die2 (Die objects)
  private Die die1, die2;
  
  // no-arg constructor
  public PairOfDice()
  {
    die1 = new Die();
    die2 = new Die();
  }
  
  // methods:
  
  // roll(): void
  public void roll()
  {
    die1.roll();
    die2.roll();
  }
  
  // isSnakeEyes(): boolean
  // getting 1 and 1
  public boolean isSnakeEyes()
  {
    return getTotal() == 2;
  }
  
  // isBoxCars(): boolean
  // getting 6 and 6
  public boolean isBoxCars()
  {
    return getTotal() == 12;
  }
  
  // isDouble(): boolean
  // getting same values on both dice
  public boolean isDouble()
  {
    return die1.getNumDots() == die2.getNumDots();
  }
  
  // is7or11(): boolean
  // getting total of 7 or 11
  public boolean is7or11()
  {
    return getTotal() == 7 || getTotal() == 11;
  }
  
  // getTotal(): int
  public int getTotal()
  {
    return die1.getNumDots() + die2.getNumDots();
  }
  
  // toString(): String
  public String toString()
  {
    return "Total: " + getTotal();
  }
}