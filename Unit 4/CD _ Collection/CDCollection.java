// Jiin Kim
// period 2
// 1/27/20

// create a class which holds a collection of CDs

import java.text.NumberFormat;

public class CDCollection
{
  // instance fields
  // declare array of CD called collection
  private CD[] collection;
  private int count;
  private double totalCost;
  
  // constructor
  public CDCollection()
  {
    collection = new CD[5];
    count = 0;
    totalCost = 0.0;
  }
  
  // service method
  public void addCD(String a, String t, double cost, int tracks)
  {
    if (count == collection.length)
      increaseSize(); // helper method to increase size of array
    collection[count] = new CD(a, t, cost, tracks);
    count++;
    totalCost += cost;
  }
  
  private void increaseSize()
  {
    CD[] newCollection = new CD[collection.length * 2];
    for (int i =  0; i < collection.length; i++)
    {
      // traverse through collection and copy each CD to the new collection 
      newCollection[i] = collection[i]; 
    }
    collection = newCollection;
  }
  
  public void swap(int pos1, int pos2)
  {
    CD cd1 = collection[pos1]; 
    collection[pos1] = collection[pos2];
    collection[pos2] = cd1;
  }
  
  // insert new CD and shift existing elements to the right
  public void insertCD(int loc, String artist, String title, double cost, int tracks)
  {
    CD cd = new CD(artist, title, cost, tracks);
    if (collection.length == count)
      increaseSize();
    CD next = cd, prev = null;
    for (int i = loc; i < count + 1; i++)
    {
      prev = next;
      next = collection[i];
      collection[i] = prev;
    }
    count++;
    totalCost += cost;
  }
  
  // 2nd method for inserting new CD and shifting existing elements to the right
  public void insertCD2(int loc, String artist, String title, double cost, int tracks)
  {
    if (collection.length == count)
      increaseSize();
    for (int i = count - 1; i >= loc; i--) // shifts elements to the right
      collection[i+1] = collection[i];
    collection[loc] = new CD(artist, title, cost, tracks);
    totalCost += cost; 
    count++;
  }
  
  // remove a CD from collection, fill in the gap by shifting elements to the left
  public void removeCD(int loc)
  {
    CD next = null, prev = null;
    totalCost -= collection[loc].getCost();
    for (int i = count - 1; i >= loc; i--)
    {
      next = collection[i];
      collection[i] = prev;
      prev = next;
    }
    count--;
  }
  
  public CD[] getCollection() // accessor method
  {
    return collection;
  }
  
  public String toString()
  {
    NumberFormat format = NumberFormat.getCurrencyInstance();
    String report = "\n\n***************************************\n\n";
    report += "My CD Collection\n\n";
    report += "Number of CDs: " + count + "\n";
    report += "Total cost: " + format.format(totalCost) + "\n";
    report += "Average Cost: " + format.format(totalCost / count);
    
    report += "\n\nCD List: \n\n";
    for (int i = 0; i < count; i++)
      report += collection[i].toString() + "\n";
    
    return report;
  }
}