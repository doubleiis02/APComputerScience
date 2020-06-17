// Jiin Kim
// period 2
// 3/31/20

// create an interface for Priority

public interface Priority
{
  static final int LOW_PRIORITY = 1;
  static final int MED_PRIORITY = 5;
  static final int HIGH_PRIORITY = 10;
    
  public void setPriority(int priority);
  public int getPriority();
}