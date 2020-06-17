// Jiin Kim
// period 2
// 2/24/20

// create a class LineList which handles an array of Strings

import java.util.ArrayList;

public class LineList
{
  // declare an instance field called lines as an ArrayList of Strings
  private ArrayList<String> lines;
  
  // constructor which initializes the lines field iwhtout specifying a capacity
  public LineList()
  {
    lines = new ArrayList<String>();
  }
  
  // methods
  
  // int size(): returns the number of lines in the list
  public int size()
  {
    return lines.size();
  }
  
  // String get(int k): returns the String from the kth line
  public String get(int k)
  {
    return lines.get(k);
  }
  
  // void add(String line): adds a String to end of list
  public void add(String line)
  {
    lines.add(line);
  }
  
  // String remove(int k): removes and returns String at k
  public String remove(int k)
  {
    return lines.remove(k);
  }
  
  // void move(int index, int newindex): moves String from index to newindex
  public void move(int index, int newindex)
  {
    String temp = lines.remove(index);
    lines.add(newindex, temp);
  }
  
  // void swapLines(int j, int k): swaps String j & k
  public void swapLines(int j, int k)
  {
    String temp = lines.get(j);
    lines.set(j, lines.get(k));
    lines.set(k, temp);
  }
  
  // void shuffle(): scrambles the list
  public void shuffle()
  {
    for (int i = 0; i < lines.size(); i++)
    {
      swapLines(i, (int)(Math.random() * lines.size()));
    }
  }
}