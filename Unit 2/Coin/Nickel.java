// Jiin Kim
// period 2
// 10/10/19

// Nickel subclass for Coin

public class Nickel extends Coin
{
  // every subclass must consider the Constructor of its parent
  public Nickel()
  {
    super("heads", 5, "nickel"); // "super" is a reserved word that calls the parent
    flip(); // no need to do Coin.flip
  }
    
  // modify or override the toString method
  public String toString()
  {
    return getType() + "(" + getValue() + ") - " + getFace();
  }
}