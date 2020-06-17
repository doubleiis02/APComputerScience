// Jiin Kim
// period 2
// 3/12/20

// create a driver for Triangle hierarchy

import java.text.DecimalFormat;

public class TestTriangles
{
  public static void main(String[] args)
  {
    DecimalFormat fmt = new DecimalFormat("0.000");
    Triangle eqTriangle = new EquilateralTriangle(12);
    Triangle rtTriangle = new RightTriangle(12);
    System.out.println("Equilateral area / perimeter ratio : " + fmt.format(eqTriangle.getRatio()));
    System.out.println("Right Triangle area / perimeter ratio: " + fmt.format(rtTriangle.getRatio()));
  }
}