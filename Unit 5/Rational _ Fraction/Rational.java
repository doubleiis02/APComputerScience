// Jiin Kim
// period 2
// 2/27/20

// create a class claled Rational which represents a fractional number

public class Rational
{
  // create 2 instance fields called numerator & denominator
  private int numerator, denominator;
  // create a statif field to count every Rational instantiated
  private static int count;
  
  // constructor
  public Rational(int n, int d)
  {
    // check the denominator for 0
    if (d == 0)
      d = 1;
    
    // check the sign of denominator
    if (d < 0)
    {
      n *= -1;
      d *= -1;
    }
      
    // assign parameter values
    numerator = n;
    denominator = d;
      
    // call helper method reduce() 
    reduce();
    count++;
  }
  
  // create accessor methods
  // don't need if using with other Rationals unless you're subclassing 
  // -> look at add, subtract, etc methods to understand
  
  public int getNumerator()
  {
    return numerator;
  }
  
  public int getDenominator()
  {
    return denominator;
  }
  
  // private helper methods
  
  private int gcd(int num1, int num2)
  {
    while (num1 != num2)
      if (num1 > num2)
        num1 = num1 - num2;
      else
        num2 = num2 - num1;
    return num1;
  }
  
  private void reduce()
  {
    if (numerator != 0)
    {
      int common = gcd(Math.abs(numerator), denominator);
      numerator /= common;
      denominator /= common;
    }
  }
  
  // service methods add, subtract, multiply, divide, reciprocal
  
  public Rational add(Rational other)
  {
    int d = denominator * other.denominator;
    int n1 = numerator * other.denominator;
    int n2 = other.numerator * denominator;
    Rational result = new Rational(n1 + n2, d);
    result.reduce();
    return result;
  }
  
  public Rational subtract(Rational other)
  {
    int d = denominator * other.denominator;
    int n1 = numerator * other.denominator;
    int n2 = other.numerator * denominator;
    Rational result = new Rational(n1 - n2, d);
    result.reduce();
    return result;
  }
  
  public Rational multiply(Rational other)
  {
    return new Rational(numerator * other.numerator, denominator * other.denominator);
  }
  
  public Rational divide(Rational other)
  {
    return multiply(other.reciprocal());
  }
  
  public Rational reciprocal()
  {
    return new Rational(denominator, numerator);
  }
  
  public double getValue() // returns Rational as a double
  {
    return (double)(numerator) / denominator;
  }
  
  // overloaded methods
  
  public String toString()
  {
    if (numerator == 0)
      return "0";
    if (denominator == 1)
      return "" + numerator;
    return numerator + "/" + denominator;
  }
  
  public boolean equals(Rational other)
  {
    return numerator == other.numerator && denominator == other.denominator;
  }
  
  // main method
  public static void main(String[] args)
  {
    Rational[] fractions = new Rational[100];
    int n, d;
    for (int i = 0; i < 20; i++)
    {
      n = (int)(Math.random() * 100) + 1;
      d = (int)(Math.random() * 100) + 1;
      fractions[i] = new Rational(n, d);
    }
    for (int i = 0; i < Rational.count; i++)
      System.out.println(fractions[i]);
    System.out.println("count = " + Rational.count); // can just do System.out.println(count);
    
    fractions[Rational.count] = new Rational(50, 100);
    // count is now 21, but bc count is printed before this is created, 
    // the output is still 20
    
    System.out.println();
    for (int i = 0; i < Rational.count; i++)
      System.out.println(fractions[i]);
    System.out.println("count = " + Rational.count); // now 21
    
    // System.out.println(this.getNumerator());
    // doesn't work bc the method is static
    // error: non-static variable this cannot be referenced from a static context
    System.out.println(fractions[4].getNumerator());
    
  }
}