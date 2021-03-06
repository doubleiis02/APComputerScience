// Jiin Kim 
// period 2
// 2/13/20

// Student class using regular array instead of an ArrayList

public class StudentA implements Stu, StuInfo
{
  // implement all the abstract methods form each interfaces
  // infer what instance fields the Student class should have to make methods work
  // also, infer what the "full arg" constructor or any overloaded constructors should be
  
  // instance fields
  private Assignment[] assignments;
  private String name, gender, username;
  private int id, year, size;
  
  // constructors
  public StudentA(String name, String gender, String username, 
                 int id, int year, Assignment[] assignments)
  {
    this.name = name;
    this.gender = gender;
    this.username = username;
    this.id = id;
    this.year = year;
    this.assignments = assignments;
    size = 0;
    for (Assignment a : assignments)
    {
      if (a != null)
        size++;
    }
  }
  
  public StudentA(String name, String gender, String username, int id, int year)
  {
    this.name = name;
    this.gender = gender;
    this.username = username;
    this.id = id;
    this.year = year;
    assignments = new Assignment[10];
    fillRandomAssignments(10);
    size = 10;
  }
  
  public StudentA(String name, String gender, String username)
  {
    this.name = name;
    this.gender = gender;
    this.username = username;
    id = (int)(Math.random() * 9000000) + 1000000;
    year = (int)(Math.random() * 10) + 2020;
    assignments = new Assignment[10];
    fillRandomAssignments(10);
    size = 10;
  }
  
  public StudentA()
  {
    name = "FirstName LastName";
    gender = "unknown";
    username = "username";
    id = (int)(Math.random() * 9000000) + 1000000;
    year = (int)(Math.random() * 10) + 2020;
    assignments = new Assignment[10];
    fillRandomAssignments(10);
    size = 10;
  }
  
  // accessor methods
  
  public String getName()
  {
    return name;
  }
  
  public int getId()
  {
    return id;
  }
  
  public String getGender()
  {
    return gender;
  }
  
  public int getYear()
  {
    return year;
  }
  
  public String getUsername()
  {
    return username;
  }
  
  public Assignment[] getAssignments()
  {
    return assignments;
  }
  
  public int getSize()
  {
    return size;
  }
  
  // service methods
  
  public Assignment getGrade(String title)
  {
    for (Assignment a : assignments)
    {
      if (a.getName().equals(title))
        return a;
    }
    return null;
  }
  
  public void addGrade(Assignment grade)
  {
    if (size >= assignments.length)
    {
      int i = 0;
      Assignment[] arr = new Assignment[size * 2];
      for (Assignment a : assignments)
      {
        arr[i] = a;
        i++;
      }
      assignments = arr;
    }
    assignments[size] = grade;
    size++;
  }
  
  public Assignment removeGrade(int index)
  {
    Assignment removed = assignments[index];
    for (int i = index; i < size; i++)
    {
      if (i == assignments.length - 1)
        assignments[i] = null;
      else
        assignments[i] = assignments[i+1];
    }
    size--;
    return removed;
  }
  
  public double getGradeAverage()
  {
    double total = 0;
    for (Assignment a : assignments)
      total += a.calcPercentage();
    return total / size;
  }
  
  public double getMaxGrade()
  {
    double max = 0;
    for (Assignment a : assignments)
    {
      if (a.calcPercentage() > max)
        max = a.calcPercentage();
    }
    return max;
  }
  
  public double getMinGrade()
  {
    double min = 1;
    for (Assignment a : assignments)
    {
      if (a.calcPercentage() < min)
        min = a.calcPercentage();
    }
    return min;
  }
  
  public void printAllGrades()
  {
    for (Assignment a : assignments)
      System.out.println(a.calcPercentage());
  }
  
  // helper method
  
  private void fillRandomAssignments(int n)
  {
    String name = "Assignment ";
    for (int i = 0; i < n; i++)
    {
      name += i+1;
      assignments[i] = new Assignment(name);
      name = "Assignment ";
    }
  }
  
  // set methods
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setGender(String gender)
  {
    this.gender = gender;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public void setYear(int year)
  {
    this.year = year;
  }
  
  public void setAssignments(Assignment[] assignments)
  {
    this.assignments = assignments;
  }                      
                 
  // also overload the toString method
  
  public String toString()
  {
    // private Assignment[] assignments;
    // private String name, gender, username;
    // private int id, year;
    
    return "Student Name: " + name
      + "\nID: " + id
      + "\nUsername: " + username 
      + "\nGrad Year: " + year
      + "\nGender: " + gender
      + "\n# of Assignments: " + size;
  }
}