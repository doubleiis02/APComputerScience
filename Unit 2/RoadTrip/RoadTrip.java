// Jiin Kim
// period 2
// 10/1/19

//create a class representing a road trip
// named RoadTrip

// write the class header
public class RoadTrip
{
// instance fields (destination, distance, time, gas)
  private String destination;
  private int distance;
  private double time; // hrs
  private double gas; // gallons
  
// constructor
  public RoadTrip(String destination, int distance)
  {
    this.destination = destination;
    this.distance = distance;
  }
  
// methods
  public void setTime(double t)
  {
    time = t;
  }
  
  public void addGas(double g)
  {
    gas = g;
  }
  
  public double calcGasMileage() // mpg
  {
    return distance / gas;
  }
  
  public double calcAvgSpeed()
  {
    return distance / time;
  }
  
  public String toString()
  {
    String result;
    result = "trip to " + destination;
    result += " mpg = " + calcGasMileage();
    result += " avg speed = " + calcAvgSpeed();
    return result;
  }

}