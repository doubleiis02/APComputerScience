// Jiin Kim
// period 2
// 12/5/19

// Tester for Card class

public class CardTester
{
  public static void main(String[] args)
  {
    // print 10 random cards, comparing two cards at a time
    for (int i = 0; i < 5; i++)
    {
      Card c1 = new Card(), c2 = new Card();
      System.out.println("Card 1: " + c1);
      System.out.println("Card 2: " + c2);
      System.out.println("Card 1 higher than Card 2? " + c1.isHigherThan(c2) + "\n");               
    }
    
    
    System.out.print("\n------------------------\n\n\n");
    
    
    // print every card
    int count = 0;
    for (int suit = 1; suit <= 4; suit++)
    {
      for (int face = 1; face <= 13; face ++)
      {
        Card c = new Card(face, suit);
        System.out.println(c);
        count++;
      }
    }
    System.out.println("\n" + count);
    
  }
}