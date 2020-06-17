// Jiin Kim
// period 2
// 10/15/19

// SmileyBalloon subclass of PartyBalloon

// imported classes in parent class are not inherited in subclass
import java.awt.Color;
import java.awt.Graphics;

public class SmileyBalloon extends PartyBalloon
{
  // constructors
  public SmileyBalloon()
  {
    super();
  }
  public SmileyBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }
  
  // override the draw method
  public void draw(Graphics g, boolean makeItFilled)
  {
    super.draw(g, makeItFilled);
    // draw face
    g.setColor(Color.WHITE);
    // DRAW SMILE
    g.drawArc(getX()-(int)(2*getRadius()*.6/2), // x
              getY(), // y
              (int)(2*getRadius()*.6), // w
              (int)(getRadius()*.6), // h
              0, // startAngle
              -180); // arcAngle
    // draw left eye
    g.drawOval(getX()-(int)(getRadius()/2), // x
               getY()-(int)(getRadius()/2), // y
               (int)(getRadius()*.2), // w
               (int)(getRadius()*.2)); // h
    // draw right eye
    g.drawOval(getX()+(int)(getRadius()/2)-(int)(getRadius()*.2), // x
               getY()-(int)(getRadius()/2), // y
               (int)(getRadius()*.2), // w
               (int)(getRadius()*.2)); // h
  }
}