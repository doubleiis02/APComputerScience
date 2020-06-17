// Jiin Kim
// period 2
// 3/10/20

// create a Volunteer class that subclasses StaffMember

// create header, constructor, concrete pay method, and toString
// have pay method return 0.0

public class Volunteer extends StaffMember
{
  public Volunteer(String n, String a, String p)
  {
    super(n, a, p);
  }
  
  public double pay()
  {
    return 0.0;
  }
  
  public String toString()
  {
    return "Volunteer\n" + super.toString();
  }
}