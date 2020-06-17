// Jiin Kim
// period 2
// 3/10/20

// create a class to hold the employees of a virtual staff for a business

import java.util.ArrayList;
import java.text.NumberFormat;

public class Staff extends ArrayList<StaffMember>
{
  public Staff()
  {
    // 4 types of objects stored in the ArrayList Staff
    // staff member is the superclass of the 4 object types
    this.add(new Executive("Dr. Jiin Kim", "123 Main", "555-0456", "123-45-6789", 126999.09));
    this.add(new Employee("Matthew Yik", "456 Off Line", "555-0101", "987-65-4321", 2432.99));
    this.add(new Employee("Noah Vardoulis", "789 Off Rocker", "523-0798", "579-20-0404", 1169.23));
    this.add(new Hourly("Ben Lee", "667 Fifth Ave", "535-0896", "956-31-2311", 9.00));
    this.add(new Hourly("Joanne Wang", "4th St.", "575-1670", "045-34-1646", 14.50));
    this.add(new Volunteer("Kaitlyn Vetica", "32 Driver Lane", "555-4112"));
    this.add(new Volunteer("Tim Kim", "293 Steven King", "234-1394"));
  }
  
  // create a method to pay all staff
  public void payday()
  {
    double amount;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    int[] bonuses = {1000, 2000, 3000, 4000, 5000, 10000};
    for (StaffMember s : this)
    {
      if (s instanceof Executive) // reserved word "instanceof"
      {
        Executive t = (Executive)(s); // new reference created to same instance, so bonus goes to original object
        int bonus = bonuses[(int)(Math.random() * bonuses.length)];
        t.awardBonus(bonus);
      }
      if (s instanceof Hourly)
      {
        Hourly h = (Hourly)(s);
        h.addHours((int)(Math.random() * 40));
      }
    }
    for (StaffMember s : this)
    {
      System.out.println(s);
      amount = s.pay(); // polymorphic call to pay method - using pay method of Executive, Employee, etc not StaffMember
      if (amount == 0.0)
        System.out.println("Thanks for Volunteering!\n");
      else
        System.out.println("Paid: " + fmt.format(amount) + "\n");
    }
  }
}