// Jiin Kim
// period 2
// 1/27/20

// class CD represents a Compact Disc

import java.text.NumberFormat;

public class CD
{
  // instance fields
  private String artist, title;
  private double cost;
  private int tracks;
  
  // constructor(s) to populate or declare instance fields with unique data
  public CD(String artist, String title, double cost, int tracks)
  {
    this.artist = artist;
    this.title = title;
    this.cost = cost;
    this.tracks = tracks;
  }
  
  // methods (or services)
  
  public String getArtist() // accessor method
  {
    return artist;
  }
  
  public String getTitle() // accessor method
  {
    return title;
  }
  
  public double getCost() // accessor method
  {
    return cost;
  }
  
  public int getTracks() // accessor method
  {
    return tracks;
  }
  
  public String toString()
  {
    NumberFormat format = NumberFormat.getCurrencyInstance();
    String result = "";
    result += "\nartist: " + artist + "\ttitle: " + title;
    result += "\ncost: " + format.format(cost) + "\ttracks: " + tracks + "\t";
    
    return result;
  }
}