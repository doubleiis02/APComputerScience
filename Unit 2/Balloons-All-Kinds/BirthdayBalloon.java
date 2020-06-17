// Jiin Kim
// period 2
// 10/15/19

// BirthdayBalloon subclass of PartyBalloon

// imported classes in parent class are not inherited in subclass
import java.awt.Color;
import java.awt.Graphics;

import java.awt.Font;

public class BirthdayBalloon extends PartyBalloon
{
  // constructors
  public BirthdayBalloon()
  {
    super();
  }
  public BirthdayBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }
  
  // override the draw method
  public void draw(Graphics g, boolean makeItFilled)
  {
    super.draw(g, makeItFilled);
    Font font = new Font("TimesRoman", Font.BOLD, (int)(getRadius()/5));
    // set font color
    g.setColor(Color.WHITE);
    g.setFont(font);
    g.drawString("Happy Birthday!", getX()-(int)(getRadius()*0.7), getY());
  }
}