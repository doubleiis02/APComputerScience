// Jiin Kim
// period 2
// 3/31/20

// create an interface for Complexity

public interface Complexity
{
  static final int LOW_COMPLEXITY = 1;
  static final int MED_COMPLEXITY = 5;
  static final int HIGH_COMPLEXITY = 10;
    
  public void setComplexity(int complexity);
  public int getComplexity();
}