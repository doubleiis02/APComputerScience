// Jiin Kim
// period 2
// 1/14/20

public class MultiTable
{
  public static void main(String[] args)
  {
    // create a 2D array for 12 x 12 multiplication table
    int[][] table = new int[13][13]; // including 0, rectangular 2d array
    
    // fill table with solutions
    for (int r = 0; r < table.length; r++)
    {
      for (int c = 0; c < table[r].length; c++)
        table[r][c] = r * c;
    }
    
    // print table using for each loop
    
    System.out.println("Multiplication table");
    System.out.println();
    for (int[] r : table)
    {
      for (int c : r)
        System.out.print(c + "\t");
      System.out.print("\n");
    }
    
  }
}