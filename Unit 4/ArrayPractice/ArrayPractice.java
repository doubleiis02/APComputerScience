// Jiin Kim
// period 2
// 1/6/20

// Arrray Practice

public class ArrayPractice
{
  public static void main(String[] args)
  {
    // Array construction, making arrays
    // int array called nums, MUST know length
    
    int[] nums; // declares an int array
    nums = new int[10]; // new array object of ints storing 10 ints
    
    System.out.println(nums);
    
    // to print each element of an array, use a for loop
    for (int i = 0; i < nums.length; i++) // no parentheses() for length of array
    {
      System.out.println(nums[i]);
    }
    nums[0] = 10;
    nums[1] = 11;
    nums[2] = 12;
    nums[3] = 13;
    nums[4] = 14;
    nums[5] = 15;
    nums[6] = 16;
    nums[7] = 17;
    nums[8] = 18;
    nums[9] = 19;
    // nums[10] = 60; // produces runtime error java.lang.ArrayIndexOutOfBoundsException: 10
    
    for (int i = 0; i < nums.length; i++) // no parentheses() for length of array
    {
      System.out.print(nums[i] + "\t");
    }
    
    // print out the sums of the first & last values
    int sum = nums[0] + nums[nums.length-1];
    System.out.println("\nThe sum of the first & last values in the array is: " + sum);
    
    // print out the sum of values stored in odd index positions
    sum = 0;
    for (int i = 1; i < nums.length; i += 2)
    {
      sum += nums[i];
    }
    System.out.println("The sum of the odd digits in the array is: " + sum);
    
    String[] names = {"Bob", "Tom", "Joe"}; // initializer list
    System.out.println(names[1]); 
  }
}