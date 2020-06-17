// Jiin Kim
// period 2
// 3/12/20

// create an abstract class representing a Triangle

public abstract class Triangle
{
  private double side;
  
  public Triangle(double side)
  {
    this.side = side;
  }
  
  public Triangle()
  {
    side = 1;
  }
  
  public double getSide()
  {
    return side;
  }
  
  public double getRatio()
  {
    return getArea() / getPerimeter();
  }
  
  public abstract double getArea();
  
  public abstract double getPerimeter();
}