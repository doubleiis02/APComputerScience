// Jiin Kim
// period 2
// 3/12/20

// create a subclass of Triangle that defines an Equilateral Triangle


public class EquilateralTriangle extends Triangle
{
  public EquilateralTriangle(double side)
  {
    super(side);
  }
  
  public EquilateralTriangle()
  {
    super();
  }
  
  public double getArea()
  {
    return getSide() * getSide() * Math.sqrt(3) / 4;
  }
  
  public double getPerimeter()
  {
    return getSide() * 3;
  }
}