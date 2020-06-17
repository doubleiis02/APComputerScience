// Jiin Kim
// period 2
// 11/21/19

// parent Die class for the CrapsStats and RollingDie class

// class header
public class Die
{
  // instance fields
  private int numDots;

  // constructor
  public Die()
  {
    roll();
  }

  // methods
  public void roll()
  {
    numDots = (int)(Math.random() * 6) + 1;
  }
  
  public int getNumDots()
  {
    return numDots;
  }
  
  public String toString()
  {
    return "Value: " + numDots;
  }
  
}