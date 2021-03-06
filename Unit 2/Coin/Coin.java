// Jiin Kim
// Period 2
// 10/7/19

// create a class definition which represents a coin

// class header
public class Coin
{

// class fields
  private String face;
  private int value;
  private String type;

// class constructor(s)
  public Coin() // "no-arg" coin constructor
  {
    flip(); // sets the face randomly
  }
  
  public Coin(String face, int value, String type)
  {
    this.face = face;
    this.value = value;
    this.type = type;
  }

// class methods
  
  public String getFace()
  {
    return face;
  }
  
  public String getType()
  {
    return type;
  }
  
  public int getValue()
  {
    return value;
  }
  
  // a "mutator" method, or "setter method" for the face field
  /*
  public void setFace(String f)
  {
    face = f; // sets or changes the face field's value
  }
  */
  
  // better mutator method for face
  public void flip()
  {
    int r = (int)(Math.random() * 100); // finds random number between 0 and 1 (can't be 1)
    if (r < 50)
      face = "heads";
    else
      face = "tails";
  }
  
  public Boolean isHeads()
  {
    return face.equals("heads");
    
    /*
    if (face == "heads")
    {
      return true;
    }
    else
    {
      return false;
    }
    */
  }
  
  // override toString method
  public String toString()
  {
    return face;
    //return type + "(" + value + ") - " + face;
    // uses + as a concatenation operator
  }
}