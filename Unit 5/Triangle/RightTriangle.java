// Jiin Kim
// period 2
// 3/12/20

// create a subclass of Triangle that defines a Right Triangle

public class RightTriangle extends Triangle
{
  public RightTriangle(double side)
  {
    super(side);
  }
  
  public RightTriangle()
  {
    super();
  }
  
  public double getArea()
  {
    return getSide() * getSide() / 2;
  }
  
  public double getPerimeter()
  {
    return getSide() * 2 + getSide() * Math.sqrt(2);
  }
}