//Chapter 3 Question 12 (a) and (b)
// Jiin Kim
// 9/17/19
// plays a rooster or cow sounds every 5 secs

import java.awt.Color;
import java.awt.Container;
//import java.awt.Event.ActionListener;
//import java.awt.Event.ActionEvent;
import java.awt.event.ActionListener; // e must be lowercase in event
import java.awt.event.ActionEvent; // e must be lowercase in event
import javax.swing.JFrame;
import javax.swing.Timer;

public class MorningA extends JFrame implements ActionListener
{
  private EasySound rooster;
  private EasySound cow;
  private boolean morning;
  /**
   *   Constructor
   */
  public MorningA()
  {
    super("MorningA");
    //rooster = new EasySound("roost.wav);
    rooster = new EasySound("roost.wav"); // was missing " at the end of the string roost.wav
    cow = new EasySound("moo.wav");
    rooster.play();
   
    Timer clock = new Timer (5000, this);
    clock.start();
  }
  
  public void actionPerformed(ActionEvent e) // fires every 5 seconds
  {
    morning = !morning; // make true to false, false to true
    
    Container c = getContentPane();
    //c.seBackground(Color.WHITE);
    if (morning)  
    {
      c.setBackground(Color.WHITE); // was missing the t in setBackground
      rooster.play();
    }
    else
    {
      c.setBackground(Color.BLACK);
      cow.play();
    }
    repaint();
  }

  public static void main(String[] args)
  {
    //Morning morning = new Morning;
    MorningA morning = new MorningA();// was missing () that shows that the function Morning() is being called
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
  }
}  
