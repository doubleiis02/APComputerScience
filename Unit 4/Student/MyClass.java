// create a class which holds a list of Student objects
import java.util.ArrayList;
public class MyClass extends ArrayList<StudentA>
{
  private String className;
  private int period;
  
  public MyClass(String className, int per, String filename)
  {
    super();  
    this.className = className;
    period = per;
    importStudents(filename);
  }
  
  public String getClassName()
  {
    return className;
  }
  
  public int getPeriod()
  {
    return period;
  }
  
  public void importStudents(String filename)
  {
    FileParser fp = new FileParser(filename);
    String[] list = fp.getList();
    String[] p; //storing parameters from each line from the txt file
    for(String s : list)
    {
       p = s.split("\t"); // returns a String elements array separated by tab
       this.addStudent(Integer.parseInt(p[0]),p[1],p[2],Integer.parseInt(p[3]),p[4]);
    }
  }
  
  //public void addStudent(
  public void addStudent(int id, String name, String gender, int yr, String username)
  {
    addStudent(new StudentA(name, gender, username, id, yr));
    // String name, String gender, String username, 
    // int id, int year, ArrayList<Assignment> assignments)
  }
  
  public void addStudent(StudentA s)
  {
    this.add(s);
  }
  
  // return the index of an assignment title ( return -1 if not found)
  private int getIndex(String title)
  {
    for(int i = 0; i < this.size(); i++)
      if(this.get(i).getName().equals(title))
      return i;
    return -1;
  }
  
  public double getClassAverages()
  {
    double total = 0.0;
    for(StudentA s : this)
      total += s.getGradeAverage();
    return total / this.size();
  }
  
  public double getMaxAverage()
  {
    double max = this.get(0).getGradeAverage();
    for(StudentA s : this)
      max = Math.max(max, s.getGradeAverage());
    return max;
  }
  
  public StudentA getMaxStudent()
  {
    int pos = 0;
    double max = this.get(0).getGradeAverage();
    for(int i = 0; i < this.size(); i++)
    {
      if(this.get(i).getGradeAverage() > max)
      {
         pos = i;
         max = this.get(i).getGradeAverage();      
      }
    }
    return this.get(pos);
  }
  
  public StudentA getMinStudent()
  {
    int pos = 0;
    double min = this.get(0).getGradeAverage();
    for(int i = 0; i < this.size(); i++)
    {
      if(this.get(i).getGradeAverage() < min)
      {
         pos = i;
         min = this.get(i).getGradeAverage();      
      }
    }
    return this.get(pos);
  }
  
  
  public double getMinAverage()
  {
    double min = this.get(0).getGradeAverage();
    for(StudentA s : this)
      min = Math.min(min, s.getGradeAverage());
    return min;
  }
  
  public StudentA getStudent(String title) // use getIndex()
  {
    if(getIndex(title) >= 0)
      return this.get(getIndex(title));
    else
      return null;
  } 
  

  
  
}