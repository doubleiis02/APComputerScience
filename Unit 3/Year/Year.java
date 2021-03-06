// Jiin Kim
// period 2
// 11/14/19

// create a class which represents a Year
// instance for year (should be an int)
// constructor (takes an int)
// accessor method getYear()
// toString method (returns String for year)
// method isLeapYear() (returns boolean true or false)

public class Year
{
  private int year;
  
  public Year(int y)
  {
    year = y;
  }
  
  public int getYear()
  {
    return year;
  }
  
  public String toString()
  {
    return "Year of " + year;
  }
  
  public boolean isLeapYear()
  {
    if (year > 1851 && year % 4 == 0)
    {
      if (year % 100 == 0)
      {
        if (year % 400 == 0)
          return true;
        return false;
      }
      return true;
    }
    return false;
  }
}