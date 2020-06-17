// Jiin Kim
// Period 2
// GUI example for a simple "Hello" program
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloGui extends JFrame
{
  public HelloGui() // constructor
  {
    super("GUI Demo");
    Container c = getContentPane();
    c.setBackground(Color.YELLOW);
    c.setLayout(new FlowLayout());
    c.add(new JLabel("Hello, GUI!", 11));
    
  }  
  public static void main(String[] args)
  {
    HelloGui window = new HelloGui();
    // set the window's location and size
    window.setBounds(1130,670,300,100);
    // upper left x,y, width, height
    
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}