// An object class to represent a graded assignment
import java.text.NumberFormat;
public class Assignment
{
  // instance fields (name, pts, ptsPossible)
  private String name;
  private int pts, ptsPossible;
  
  // full arg constructor
  public Assignment(String n, int p, int pp)
  {
    name = n;
    pts = p;
    ptsPossible = pp;
  }
  
  // single arg constructor for just the title(name)
  public Assignment(String n)
  {
    name = n;
    int[] values = {5, 10, 20, 50, 100};
    ptsPossible = values[(int)Math.random() * values.length];
    pts = (int)(Math.random() * (ptsPossible + 1));
  }
  
  
  
  // Accessor methods for all fields (getter methods)
  
 public String getName()
 {
  return name;
 }
 public int getPts()
 {
  return pts;
 }
 public int getPtsPossible()
 {
  return ptsPossible;
 }
  // Mutator methods for all fields (setter methods)
 public void setName(String n)
 {
  name = n;
 }
 public void setPts(int p)
 {
  pts = p;
 }
 public void setPtsPossible(int pp)
 {
  ptsPossible = pp;
 }
 
 // service method calculate the percentage
 public double calcPercentage()
 {
   return (double)pts / ptsPossible * 100;
 }

 public String toString()
 {
   NumberFormat fmt = NumberFormat.getPercentInstance();
   String result = name + " (" + pts + "/" + ptsPossible + ")";
   result += " " + fmt.format(calcPercentage());
   return result;
 }




 
 
 
  
}