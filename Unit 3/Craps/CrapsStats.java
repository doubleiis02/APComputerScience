// Statistical simulation of craps

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CrapsStats extends JFrame
    implements ActionListener
{
  private CrapsGame game; // field that keeps track of the game (current total, if roll is a win or lose or continue)
  private JTextField numberIn, statsOut;

  // Constructor
  public CrapsStats()
  {
    super("Craps test");

    Container c = getContentPane();
    c.setLayout(new FlowLayout());

    c.add(new JLabel("Number of games to run:"));

    numberIn = new JTextField(5);
    numberIn.addActionListener(this);
    c.add(numberIn);

    statsOut = new JTextField(18);
    statsOut.setEditable(false);
    c.add(statsOut);

    game = new CrapsGame();
  }

  // Called when a number is entered in the numberIn text field
  public void actionPerformed(ActionEvent e)
  {
    String s = numberIn.getText();
    int nGames = Integer.parseInt(s);
    int result, gameCount = 0, winCount = 0;
    Die die1 = new Die(); // creates two new Die objects using no-arg constructor
    Die die2 = new Die();

    while (gameCount < nGames)
    {
      die1.roll(); // Die.roll() changes the dots parameter of Die to random number between 1-6
      die2.roll(); // public void method
      int total = die1.getNumDots() + die2.getNumDots(); // Die.getNumDots() returns int corresponding to the dots
      result = game.processRoll(total); // CrapsGame.processroll() returns result of game as an int
      if (result != 0)
        gameCount++; // gameCount keeps track of number of wins+losses
      if (result > 0)
        winCount++; // if result > 0 then the roll is a win
    }
    numberIn.setText("");
    statsOut.setText(" Games: " + gameCount + " Wins: " + winCount);
  }

  public static void main(String args[])
  {
    CrapsStats window = new CrapsStats();
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
  }
}

