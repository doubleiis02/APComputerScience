// Jiin Kim
// period 2
// 3/10/20

import java.text.NumberFormat;

// create a class Employee which subclasses StaffMember

public class Employee extends StaffMember
{
  // add isntance fields for ssn and payRate
  private String ssn;
  private double payRate;
  private static int employeeCount = 0;
  
  // full-arg constructor
  public Employee(String n, String a, String p, String s, double pay)
  {
    super(n, a, p); // call to parent constructor in first line
    ssn = s;
    payRate = pay;
    employeeCount += 1;
  }
  
  // add accessor method getPayRate
  public double getPayRate()
  {
    return payRate;
  }
  
  // override toString
  public String toString()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String result = "Employee\n" + super.toString() + "\n"; // calling parent toString method
    result += "SSN: " + ssn + "\n";
    result += "Pay Rate: " + fmt.format(payRate);
    return result;
  }
  
  // override abstract pay() method
  public double pay()
  {
    return payRate;
  }
  
  public static int getEmployeeCount()
  {
    return employeeCount;
  }
}