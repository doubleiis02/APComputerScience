// Jiin Kim
// Period 2
/**
 * This program displays a message that moves horizontally
 * across the window.
 */

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Banner extends JPanel implements ActionListener
{
  public int xPos, yPos;  // hold the coordinates of the message

  // Called automatically after a repaint request
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); // Paint the background
    g.setColor(Color.CYAN);
    g.drawString("Hello, Action!", xPos, yPos);
    
    g.setColor(Color.PINK);
    g.drawString("Bye, Action!", xPos + 300, yPos);
  }

  // Called automatically when the timer "fires"
  public void actionPerformed(ActionEvent e)
  {
    // Adjust the horizontal position of the message:
    //xPos--;  // subtract 1
    xPos = xPos - 5;
    //if (xPos < -100)
    if (xPos < -400)
      xPos = getWidth();

    repaint();
  }

}
