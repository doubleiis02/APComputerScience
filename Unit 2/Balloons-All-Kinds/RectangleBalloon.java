// Jiin Kim
// period 2
// 10/15/19

// RectangleBalloon subclass for Balloon

// imported classes in parent class are not inherited in subclass
import java.awt.Color;
import java.awt.Graphics;

public class RectangleBalloon extends Balloon
{
  // constructors w ith parent constructor satisfied
  public RectangleBalloon()
  {
    super();
  }
  public RectangleBalloon(int x, int y, int r, Color c)
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
      g.fillRect(x-r, y-r, r, r*2);
    else
      g.drawRect(x-r, y-r, r, r*2);
  }
}