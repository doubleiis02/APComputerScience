// Jiin Kim
// period 2
// 3/31/20

// create a class which represents a Task

public class Task implements Priority, Complexity, Comparable<Task>
{
  // instance fields
  private int complexity, priority;
  private String name;
  
  // constructors
  
  public Task(String n)
  {
    name = n;
    this.complexity = MED_COMPLEXITY;
    this.priority = MED_PRIORITY;
  }
  
  public Task (String n, int p, int c)
  {
    name = n;
    setPriority(p);
    setComplexity(c);
  }
  
  // compareTo method
  public int compareTo(Task o)
  {
    if (this.priority == o.priority)
      return 0;
    else if (this.priority > o.priority)
      return 1;
    else
      return -1;
  }
  
  // implement interface methods
  
  public void setComplexity(int complexity)
  {
    if (complexity > HIGH_COMPLEXITY)
      this.complexity = 10;
    else if (complexity < LOW_COMPLEXITY)
      this.complexity = 1;
    else
      this.complexity = complexity;
  }
  
  public int getComplexity()
  {
    return complexity;
  }
  
  public void setPriority(int priority)
  {
    if (priority > HIGH_PRIORITY)
      this.priority = 10;
    else if (priority < LOW_PRIORITY)
      this.priority = 1;
    else
      this.priority = priority;
  }
  
  public int getPriority()
  {
    return priority;
  }
  
  // toString method
  
  public String toString()
  {
    return name + " Priority: " + priority + " , Complexity: " + complexity;
  }
}