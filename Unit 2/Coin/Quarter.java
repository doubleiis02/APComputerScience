// Jiin Kim
// period 2
// 10/10/19

// Quarter subclass for Coin

public class Quarter extends Coin
{
  // every subclass must consider the Constructor of its parent
  public Quarter()
  {
    super("heads", 25, "quarter"); // "super" is a reserved word that calls the parent
    flip(); // no need to do Coin.flip
  }
    
  // modify or override the toString method
  public String toString()
  {
    return getType() + "(" + getValue() + ") - " + getFace();
  }
}