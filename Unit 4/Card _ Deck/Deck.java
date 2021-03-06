// Jiin Kim
// period 2
// 1/9/20

// Deck stores 52 cards as an array

public class Deck
{
  // instance field array of 52 cards
  private Card[] deck = new Card[52];
  
  // constructor creates all 52 cards and places into array "deck"
  public Deck()
  {
    // public Card(int f, int s)
    int i = 0;
    for (int s = 1; s < 5; s++) // iterate over every suit
    {
      for (int f = 1; f < 14; f++) // iterate over every face
      {
        deck[i] = new Card(f, s); // set card to position i
        i++; // allows i to go from 0 to 51
      }
    }
  }

  // service method swap(int i, int j): void
  public void swap(int i, int j)
  {
    Card cardi = deck[i], cardj = deck[j];
    deck[i] = cardj;
    deck[j] = cardi;
  }
  
  public void shuffle2()
  {
    for (int i = 0; i < 52; i++)
    {
      int j = (int)(Math.random() * 52);
      swap(i, j);
    }
  }
  
  // service method shuffle(): void
  public void shuffle()
  {
    int randpos;
    Deck deckcopy = new Deck();
    int[] check = new int[52];
    for (int i = 0; i < 52; i++)
    {
      do
      {
        randpos = (int)(Math.random() * 52);
        if (check[randpos] == 0)
        {
          deck[randpos] = deckcopy.deck[i];
        }
      } while(check[randpos] == 1);
      check[randpos] = 1;
    }
  }
  
  // toString method / prints all elements of deck
  public String toString()
  {
    String result = "";
    int i = 0;
    for (Card c : deck)
    {
      result += i + "- " + c + "\n";
      i++;
    }
    return result;
  }
  
  // find card index
  public int findCard(Card c)
  {
    for (int i = 0; i < 52; i++)
    {
      if (c.equals(deck[i]))
        return i;
    }
    return -1;
  }
  
  // getDeck method
  public Card[] getDeck()
  {
    return deck;
  }
  
  public static void main(String[] args)
  {
    Deck d = new Deck();
    System.out.print(d);
    Card c = new Card(2, 1);
    System.out.println("\nindex of Five of Hearts = " + d.findCard(c));
    d.shuffle2();
    System.out.print("\n\n\n" + d);
  }
}