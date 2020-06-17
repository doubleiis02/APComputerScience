// Jiin Kim
// period 2
// 10/10/19

// create a subclass of Coin for a specific Monetary value

public class Penny extends Coin
{
  // every subclass must consider the Constructor of its parent
  public Penny()
  {
    super("heads", 1, "penny"); // "super" is a reserved word that calls the parent
    flip(); // no need to do Coin.flip
  }
    
  // modify or override the toString method
  public String toString()
  {
    return getType() + "(" + getValue() + ") - " + getFace();
  }
}