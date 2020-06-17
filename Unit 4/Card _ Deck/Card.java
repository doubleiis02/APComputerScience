// Jiin Kim
// period 2
// 12/3/19

// Card class represents a Playing card

public class Card
{
  // instance fields
  private int face, suit;
  private String faceName, suitName;
  
  // set up constants
  private static final int NUM_FACES = 13;
  private static final int NUM_SUITS = 4;
  
  public static final int ACE = 1;
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;
  
  public static final int CLUBS = 1;
  public static final int DIAMONDS = 2;
  public static final int HEARTS = 3;
  public static final int SPADES = 4;
  
  // CONSTRUCTORS
  public Card()
  {
    face = (int)(Math.random() * 13) + 1;
    setFaceName();
    suit = (int)(Math.random() * 4) + 1;
    setSuitName();
  }
  public Card(int f, int s)
  {
    face = f;
    setFaceName();
    suit = s;
    setSuitName();
  }
  
  // METHODS
  
  // private helper method
  private void setFaceName()
  {
    switch(face)
    {
      case 1:
        faceName = "Ace";
        break;
      case 2:
        faceName = "Two";
        break;
      case 3:
        faceName = "Three";
        break;
      case 4:
        faceName = "Four";
        break;
      case 5:
        faceName = "Five";
        break;
      case 6:
        faceName = "Six";
        break;
      case 7:
        faceName = "Seven";
        break;
      case 8:
        faceName = "Eight";
        break;
      case 9:
        faceName = "Nine";
        break;
      case 10:
        faceName = "Ten";
        break;
      case 11:
        faceName = "Jack";
        break;
      case 12:
        faceName = "Queen";
        break;
      case 13:
        faceName = "King";
        break;
    }
  }
  
  // private helper method
  private void setSuitName()
  {
    switch(suit)
    {
      case 1:
        suitName = "Clubs";
        break;
      case 2:
        suitName = "Diamonds";
        break;
      case 3:
        suitName = "Hearts";
        break;
      case 4:
        suitName = "Spades";
        break;
    }
  }
  
  // accessor methods
  // return the value of the object's fields
  
  public int getFace() // return face value
  {
    return face;
  }
  
  public int getSuit() // return suit value
  {
    return suit;
  }
  
  public String getFaceName() // return faceName value
  {
    return faceName;
  }
  
  public String getSuitName() // return suitName value
  {
    return suitName;
  }
  
  // service methods
  
  // toString method
  // overriding the existing toString method
  public String toString()
  {
    return faceName + " of " + suitName;
  }
  
  // return true if the card is red
  public boolean isRed()
  {
    return suit == 2 || suit == 3;
  }
  
  // return true if the card is black
  public boolean isBlack()
  {
    return !isRed();
  }
  
  // are the face equal, check the suit
  // not equal check aceHigh && face == Ace
  // if not then just check the face value
  public boolean isHigherThan(Card card2, boolean aceHigh)
  {
    if (face == card2.getFace())
    {
      return suit > card2.getSuit();
    }
    if (aceHigh)
    {
      if (face == 1)
        return true;
      if (card2.getFace() == 1)
        return false;
    }
    return face > card2.getFace();
  }
  
  // overload the isHigherThan with one parameter
  public boolean isHigherThan(Card card2)
  {
    return isHigherThan(card2, true);
  }
  
  // equals method returns a boolean if it finds an equal card
  public boolean equals(Card other)
  {
    return face == other.getFace() && suit == other.getSuit();
  }
}