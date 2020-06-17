// Jiin Kim
// period 2
// 3/10/20

// a driver class for the Staff hierarchy

public class Firm
{
  public static void main(String[] args)
  {
    Staff personnel = new Staff();
    System.out.println("Staff Count: " + personnel.size());
    System.out.println("Total Paid Employees: " + Employee.getEmployeeCount());
    System.out.println("Total Volunteers: " + (personnel.size()-Employee.getEmployeeCount()));
    System.out.println("\n*************************************************\n");
    personnel.payday();
  }
}