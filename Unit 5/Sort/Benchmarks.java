/**
 * This program compares benchmarks for Selection Sort,
 * Insertion Sort, Mergesort and Quicksort (and Arrays.sort for
 * Question 16 in the exercises)
 * 
 * Jiin Kim
 * 
 * Analysis of the Benchmark lab - compare sorts for time efficiencies
 *   ordered from least to most efficient
 *   array size = 5000, numberOfRuns = 200
 *   
 *   SelectionSort: avg time around 6.2 milliseconds, least efficient by a long shot
 *   InsertionSort: avg time around 1.8-1.9 milliseconds, second least efficient
 *   Mergesort: avg time around 0.4-0.5 milliseconds, second most efficient,
 *     though there is not a large difference in efficiency compared to Quicksort
 *   Quicksort: avg time around 0.3 milliseconds, most efficient
 * 
 * What sort do you think the Arrays class uses (#5)?
 *   It most likely uses a quicksort method, 
 *   as it has the smallest average run time out of all the sorts 
 *   (around 0.2-0.3 milliseconds, which is close to the avg time for Quicksort)
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.util.Random;
import java.util.Arrays;

public class Benchmarks extends JFrame
{
  private static int numberOfRuns = 20;

  private JTextField arraySizeInput, display;
  private String sortMethodNames[] =
     {"Selection Sort", "Insertion Sort", "Mergesort", "Quicksort", "Arrays"};
  private JComboBox<String> chooseSortMethod;
  // Starting Java 7 JComboBox is type specific.  In earlier versions use
  // private JComboBox chooseSortMethod;

  private final long seed;
  private int arraySize;

  // Constructor
  public Benchmarks()
  {
    super("Benchmarks");

    Container c = getContentPane();
    c.setLayout(new GridLayout(6, 1));

    c.add(new JLabel(" Array size: "));
    arraySizeInput = new JTextField(4);
    arraySizeInput.setText("1000");
    arraySizeInput.selectAll();
    c.add(arraySizeInput);

    chooseSortMethod = new JComboBox<String>(sortMethodNames);
    // Before Java 7: chooseSortMethod = new JComboBox(sortMethodNames);
    
    c.add(chooseSortMethod);

    JButton run = new JButton("Run");
    run.addActionListener(new RunButtonListener());
    c.add(run);

    c.add(new JLabel(" Avg Time (milliseconds): "));

    display = new JTextField("   Ready");
    display.setBackground(Color.YELLOW);
    display.setEditable(false);
    c.add(display);

    // Use the same random number generator seed for all benchmarks
    //   in one run of this program:
    seed = System.currentTimeMillis();
  }

  /**
   * Fills a[] with random numbers and sorts it using the sorting method
   * specified in sortMethod:
   *    1 -- Selection Sort
   *    2 -- Insertion Sort
   *    3 -- Mergesort
   *    4 -- Quicksort
   * This is repeated numberOfRuns times for better accuracy
   * Returns the total time it took in milliseconds.
   */
  private long runSort(double[] a, int sortMethod, int numberOfRuns)
  {
    Random randomGenerator = new Random(seed);
    long totalTime = 0;
    // for loop for repeated runs
    for (int i = 0; i < numberOfRuns; i++)
    {
      // fill a[] with random dumbers
      for (int k = 0; k < a.length; k++)
        a[k] = randomGenerator.nextDouble();
      
      long startTime = System.currentTimeMillis();
    
      switch(sortMethod)
      {
        case 1:
          SelectionSort.sort(a);
          break;
        case 2:
          InsertionSort.sort(a);
          break;
        case 3:
          Mergesort.sort(a);
          break;
        case 4:
          Quicksort.sort(a);
          break;
        case 5:
          Arrays.sort(a);
      }
      totalTime += System.currentTimeMillis() - startTime;
    }
    return totalTime;
  }

  /**
   * Handles Run button events
   */
  private class RunButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      String inputStr = arraySizeInput.getText().trim();
      try
      {
        arraySize = Integer.parseInt(inputStr);
      }
      catch (NumberFormatException ex)
      {
        display.setText(" Invalid array size");
        arraySize = 0;
        return;
      }

      if (arraySize <= 0)
      {
        display.setText(" Invalid array size");
        return;
      }

      if (arraySize <= 0)
        return;

      int sortMethod = chooseSortMethod.getSelectedIndex() + 1;
      double a[] = new double[arraySize];
      double avgTime = (double)runSort(a, sortMethod, numberOfRuns)
                                                          / numberOfRuns;
      display.setText(String.format("  %.2f", avgTime));

      arraySizeInput.selectAll();
      arraySizeInput.requestFocus();
      System.out.println("Array size = " + arraySize +
            " Runs = " + numberOfRuns + " " +
            sortMethodNames[sortMethod - 1] + " avg time: " + avgTime);

    }
  }

  //************************************************************

  public static void main(String[] args)
  {
    numberOfRuns = 200;
    if (args.length > 0)
    {
      int n = -1;
      try
      {
        n = Integer.parseInt(args[0].trim());
      }
      catch (NumberFormatException ex)
      {
        System.out.println("Invalid command-line parameter");
        System.exit(1);
      }
      if (n > 0)
        numberOfRuns = n;
    }

    Benchmarks window = new Benchmarks();
    window.setBounds(300, 300, 180, 200);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
