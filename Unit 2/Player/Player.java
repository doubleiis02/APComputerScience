// Jiin Kim
// 9/30/19
// Period 2

// intro to object oriented programming
// Player represents a Sports Figure

// formatting the output of the percentage to two decimal places

import java.text.DecimalFormat;

public class Player
{
  // instance fields
  private String name;
  private int attempts;
  private int scored;

  // create a DecimalFormat object that will turn double into a string formatted to 2 decimal places
  DecimalFormat df = new DecimalFormat("#.00"); 
    
  // constructor
  public Player(String n)
  {
    name = n; // assign n to name
  }
  
  // methods necessary for the class to run
  public String getName() // return a String
  {
    return name; // returns instance field name when called
  }
  
  public void setAttempts(int a)
  {
    attempts += a; // increment attempts by a
  }
  
  public void setScore(int s)
  {
    scored += s; // increment scored by s
  }
  
  public double getPercentage() // calculate & return scoring percentage
  {
    return 100 * (scored / (double)attempts);
    //return (double)scored / (double)attempts; // divide by (double) int or else the method will return 0.0
  }
  
  public String toString() // overload object toString method
  {
    return "Player: " + name + " - Scoring Percentage: " + df.format(getPercentage()) + "%";
    // System.out.println(Player) returns the string above for the object
    // if we didn't overwrite toString it would return a hexadecimal like Player@1799f9bf
  }
}