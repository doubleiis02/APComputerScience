// Jiin Kim
// period 2
// 10/22/19

// VariablePractice

import javax.swing.JOptionPane;

public class VariablePractice
{
  // instance fields should always have private or public
  private String name; // note class scope reserved word "private"
  private int age;
  private boolean isOld;
  private double gpa;
  private boolean isSmart;
  
  public VariablePractice()
  {
    name = JOptionPane.showInputDialog("What is your name?" );
    age = (int)(Math.random()*45) + 15;
    isOld = age > 40; // assigns boolean true or false to isOld field
    gpa = Math.random()*5;
    isSmart = gpa > 3.5;
  }
  
  // accessor method
  public String getName()
  {
    return name;
  }
  public int getAge()
  {
    return age;
  }
  public boolean getIsOld()
  {
    return isOld;
  }
  public double getGpa()
  {
    return gpa;
  }
  public boolean getIsSmart()
  {
    return isSmart;
  }
  
  public static void main(String[] args)
  {
    VariablePractice p = new VariablePractice();
    System.out.println("Your name is " + p.getName());
    System.out.println("Your age is " + p.getAge());
    String whatAge = p.getIsOld() ? "Ur old" : "Grow up";
    System.out.println(whatAge);
    System.out.println("Your GPA is " + p.getGpa());
    String whatGpa = p.getIsSmart() ? "Ur smart" : "Ur dumb";
    System.out.println(whatGpa);
    
    System.out.println("isAge: " + p.isOld); // directly reference isOld field
    System.out.println("gpa: " + p.gpa); // directly reference gpa field
    char letterGrade = 'A'; // declare local char variable
    System.out.println("You started with an " + letterGrade + " average");
    if (p.gpa > 4)
      letterGrade = 'A';
    else if (p.gpa > 3)
      letterGrade = 'B';
    else if (p.gpa > 2)
      letterGrade = 'C';
    else if (p.gpa > 1)
      letterGrade = 'D';
    else
      letterGrade = 'F';
    System.out.println("Now you have a letter grade average of " + letterGrade);
  }
}