// Jiin Kim
// period 2
// 2/4/20

// an object class to represent a graded assignment

import java.text.NumberFormat;

public class Assignment
{
  // instance fields (name, points, ptsPossible)
  private String name; 
  private double pts;
  private int ptsPossible;
  
  // full arg constructor
  public Assignment(String n, double p, int pp)
  {
    name = n;
    pts = p;
    ptsPossible = pp;
  }
  
  // single arg constructor for just the title (name)
  public Assignment(String n)
  {
    name = n;
    int[] values = {5, 10, 20, 50, 100};
    ptsPossible = values[(int)(Math.random() * values.length)];
    pts = (int)(Math.random() * (ptsPossible + 1));
  }
  
  // accessor methods for all fields
  
  public String getName()
  {
    return name;
  }
  
  public double getPts()
  {
    return pts;
  }
  
  public int getPtsPossible()
  {
    return ptsPossible;
  }
                    
  // mutator methods for all fields
  
  public void setName(String n)
  {
    name = n;
  }
  
  public void setPts(double p)
  {
    pts = p;
  }
  
  public void setPtsPossible(int p)
  {
    ptsPossible = p;
  }
  
  // service method that calculates the percentage
  public double calcPercentage()
  {
    return pts / ptsPossible;
  }
  
  //toString
  public String toString()
  {
    NumberFormat fmt = NumberFormat.getPercentInstance();
    String result = "Name: " + name;
    result += "\nPoints: " + pts + "/" + ptsPossible;
    result += "\nPercentage: " + fmt.format(calcPercentage());
    return result;
  }
}