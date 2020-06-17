// Jiin Kim
// period 2
// 2/3/20

// practice class with ArrrayList data structure

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice
{
  public static void main(String[] args)
  {
    // declare and initialize ArrayList of String named "names"
    ArrayList<String> names = new ArrayList<String>(); // always have <E>
    
    // declare an ArrayList storing char named letters w capacity of 26
    ArrayList<Character> letters = 
      new ArrayList<Character>(26); // wrapper class for char = Character
    
    // declare a List of Integer named nums
    List<Integer> nums; // wrapper class for int = Integer
    
    // initialize nums as ArrayList w capacity of 30
    nums = new ArrayList<Integer>(30); // AN ARRAYLIST IS A LIST
    
    // print out the nums list
    System.out.println(nums); // run -> []
    System.out.println(nums.isEmpty()); // run -> true
    
    // write a for lop to add 20 random int to nums
    for (int i = 0; i < 20; i++)
      nums.add((int)(Math.random() * 101));
    System.out.println(nums);
    
    // insert the number 500 to the middle of the list
    nums.add(nums.size()/2, new Integer(500));
    System.out.println(nums);
    System.out.println(nums.size()); // run -> 21
    
    // find & remove the 500 -> place at the beginning & end of list
    int fh = nums.remove(nums.indexOf(500));
    nums.add(0, fh);
    nums.add(fh);
    System.out.println(nums);
    System.out.println(nums.size());
    
    // remove all of the even numbers from nums and place them into evens
    int n = 0;
    ArrayList<Integer> evens = new ArrayList<Integer>();
    while (n < nums.size())
    {
      if (nums.get(n) % 2 == 0)
        evens.add(nums.remove(n));
      else // prevents skipping a value after nums.remove(n) since n values shift
        n++; // for loop -> i-- after you remove
    }
    System.out.println("odds: " + nums);
    System.out.println("evens: " + evens);
    
    // populate the letters ArrayList with a - z
    for (int i = 'a'; i <= 'z'; i++)
      letters.add(new Character((char)i)); // or letters.add((char)i);
    System.out.println(letters);
    
    // remove all vowels from our letters list and add to ArrayList vowels
    ArrayList<Character> vowels = new ArrayList<Character>();
    for (int i = 0; i < letters.size(); i++)
    {
      if (isVowel(letters.get(i)))
      {
        vowels.add(letters.remove(i));
        i--;
      }
    }
    System.out.println("consonants: " + letters);
    System.out.println("vowels: " + vowels);
  }
  
  public static boolean isVowel(char c)
  {
    String vowels = "aeiou";
    return vowels.indexOf(c) >= 0;
    
    /*boolean isVowel = false;
    switch(c)
    {
      case 'a':
        isVowel = true;
        break;
      case 'e':
        isVowel = true;
        break;
      case 'i':
        isVowel = true;
        break;
      case 'o':
        isVowel = true;
        break;
      case 'u':
        isVowel = true;
    }
    return isVowel;*/
    
    /*ArrayList<Character> v = new ArrayList<Character>();
    v.add('a'); v.add('e'); v.add('i'); v.add('o'); v.add('u');
    return v.contains(c);*/
  }
}