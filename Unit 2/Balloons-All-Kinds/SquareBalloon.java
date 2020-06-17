// Jiin Kim
// period 2
// 10/10/19

// subclass of Balloon for the BalloonDraw program

// imported classes in parent class are not inherited in subclass
import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{
  // constructors w ith parent constructor satisfied
  public SquareBalloon()
  {
    super();
  }
  public SquareBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }
  
  // our subclass should change the way that this balloon is drawn
  
  //override the draw method
  public void draw(Graphics g, boolean makeItFilled)
  {
    int x = getX();
    int y = getY();
    int r = getRadius();
    Color c = getColor();

    g.setColor(c);
    if (makeItFilled)
      g.fillRect(x-r, y-r, r*2, r*2);
    else
      g.drawRect(x-r, y-r, r*2, r*2);
  }
}