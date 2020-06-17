// Jiin Kim
// period 2
// 10/10/19

// Dime subclass for Coin

public class Dime extends Coin
{
  // every subclass must consider the Constructor of its parent
  public Dime()
  {
    super("heads", 10, "dime"); // "super" is a reserved word that calls the parent
    flip(); // no need to do Coin.flip
  }
    
  // modify or override the toString method
  public String toString()
  {
    return getType() + "(" + getValue() + ") - " + getFace();
  }
}