// Jiin Kim
// Lab Ch3 MovingDisk
// 9/16/19
// creates a moving disk graphic that represents day & night

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingDisk extends JPanel
                  implements ActionListener
{
  private int time;

  public MovingDisk()
  {
    time = 0; // was missing semicolon
    Timer clock = new Timer(30, this);
    clock.start(); // was missing ()
  }

  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)(75 * Math.sin(0.005 * Math.PI * time)); // was missing { before 75
    int r = 20;

    Color sky;
    if (y > 130) // if statements must be within brackets
    {
      sky = Color.BLACK; // was missing semicolon
    }
    else // else statements must be within brackets
    {
      sky = Color.CYAN;
    }
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String[] args) // was missing [] after String
  {
    JFrame w = new JFrame("Moving Disk"); // was missing " at the end of string
    w.setSize(300, 150);

    Container c = w.getContentPane();
    c.add(new MovingDisk()); // m in MovingDisk was not capitalized

    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setResizable(false);
    w.setVisible(true);
  }
}

