// Jiin Kim
// period 2 
// 10/1/19

// driver class for RoadTrip

public class RoadTripRunner
{ 
  public static void main(String[] args)
  {
    RoadTrip r1 = new RoadTrip("La Jolla", 120);
    RoadTrip r2 = new RoadTrip("Ojai", 134);
    
    r1.setTime(1.3);
    r1.addGas(3.2);
    r2.setTime(2.7);
    r2.addGas(7.4);
    
    System.out.println(r1);
    System.out.println(r2);
  }
}