// Jiin Kim
// period 2
// 1/7/20

// Practice calss for arrays & numbers

public class MyNums
{
  // instance field: an array of ints called nums
  int[] nums;
  
  // constructor: initializes instance field nums to 100 values
  // calls method to randomize numbers in array
  public MyNums()
  {
    nums = new int[100];
    randomize();
  }
  
  public void randomize() // helper method
  {
    for (int i = 0; i < nums.length; i++) // create loop that adds random numbers to num array
      nums[i] = (int)(Math.random() * 100) + 1; // 1 to 100
  }
  
  public int[] getNums()
  {
    return nums;
  }
  
  public String toString()
  {
    String result = "";  
    // create a String 10 elements on 10 rows
    for (int i = 0; i < 100; i++)
    {
      result += nums[i] + "\t";
      if ((i + 1) % 10 == 0)
        result += "\n";
    }
    return result;
  }
  
  // service methods
  
  public int getMax() // return max value in nums
  {
    int n = nums[0];
    for (int i = 1; i < 100; i++)
    {
      if (nums[i] > n)
        n = nums[i];
    }
    return n;
  }
    
  public int findMax() // find index position of max
  {
    int n = getMax();
    for (int i = 0; i < 100; i++)
    {
      if (n == nums[i])
        return i;
    }
    return 0;
  }
    
  public int getMin() // return min value in nums
  {
    int n = nums[0]; 
    for (int i = 1; i < 100; i++)
    {
      if (nums[i] < n)
        n = nums[i];
    }
    return n;
  }
    
  public int findMin() // find index position of min
  {
    int n = getMin();
    for (int i = 0; i < 100; i++)
    {
      if (n == nums[i])
        return i;
    }
    return 0;
  }
    
  public int getAvg() // return avg value in nums
  {
    int total = 0;
    for (int i = 0; i < 100; i++)
    {
      total += nums[i];
    }
    return total / 100;
  }
  
  public void swapFirstLast()// swaps the first & last elements
  {
    int f = nums[0], l = nums[nums.length-1]; // f = original first value, l = original last value
    nums[0] = l; // first element is now the original last element
    nums[nums.length-1] = f; // last element is now the original first element
  }
}