// create a class with static search methods

public class Searches
{
  public static int linearSearch (int[] nums, int value)
  {
    for (int i = 0; i < nums.length; i++)
      if (value == nums[i])
        return i;
    return -1;
  }
  
  public static int linearSearch (double[] nums, double value)
  {
    double tolerance = 0.001;
    for (int i = 0; i < nums.length; i++)
    {
      double diff = value - nums[i];
      if (diff < tolerance)
        return i;
    }
    return -1;
  }
  
  public static int linearSearch (Object[] list, Object target)
  {
    for (int i = 0; i < list.length; i++)
      if (target.equals(list[i]))
        return i;
    return -1;
  }
  
  public static int binarySearch (int[] nums, int value)
  {
    int low = 0;
    int high = nums.length-1;
    int middle = (low + high)/2;
    while (nums[middle] != value && low <= high)
    {
      if (value < nums[middle])
        high = middle - 1; 
      else
        low = middle + 1;
      middle = (low + high) / 2;
    }
    if (nums[middle] == value)
      return middle;
    else
      return -1;
  }
  
  public static int binarySearch(Object[] list, Comparable<? super Object> o)
  {
    // complete this method???
    int low = 0, high = list.length - 1, middle = (low + high) / 2;
    int diff;
    while (o.equals(list[middle]) == false && low <= high)
    {
      diff = o.compareTo(list[middle]);
      if (diff < 0)
        high = middle - 1;
      else
        low = middle + 1;
      middle = (low + high) / 2;
    }
    if (o.equals(list[middle]))
      return middle;
    return -1;
  }
  
  // complete questions here
  
  /* 1. What is the difference between searching and sorting algorithms?
   * Searching algorithms search for an object within a list that has the same value as the
   * object you are searching for and then returns the index value of that object within the list.
   * Sorting algorithms rearrange the objeects within a list into a set order 
   * (ex: low to highest, alphabetical order)
   */
  
  /* 2. What is generally returned by a method using a searching algorithm?
   * It returns an int which represents the index position of the object you searched for
   */
  
  /* 3. What are the three methods presented for the purpose of comparing objects?
   * equals, compareTo, compare
   */
  
  /* 4. Which of the three methods returns a boolean result?
   * equals
   */
  
  /* 5. Which of the three methods is passed an "Object" data type as a parameter?
   * equals
   */
  
  /* 6. Which of the three methods is part of the Comparable interface?
   * compareTo
   */
  
  /* 7. Which of the searching algorithms covered is more efficient?
   * binary search
   */
  
  /* 8. Which of the searching algorithms covered requires a sorted list?
   * binary search
   */
}