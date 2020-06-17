// Jiin Kim
// period 2
// 1/28/20

// driver class for the CD Collection project

public class TestCD
{
  public static void main(String[] args)
  {
    CDCollection music = new CDCollection();
    music.addCD("EXO", "EX'ACT", 15.99, 7);
    music.addCD("Billy Joel", "Storm Front", 14.95, 10);
    music.addCD("Disney", "The Little Mermaid", 12.99, 11);
    music.addCD("Les Miserables", "Les Miserables Soundtrack", 17.95, 33);
                
    System.out.println(music);
    
    music.insertCD(2, "Day6", "The Book of Us: Entropy", 12.99, 9);
    System.out.println(music);
    
    music.removeCD(1);
    System.out.println(music);
  }
}