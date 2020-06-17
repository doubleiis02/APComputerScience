// Jiin Kim
// period 2
// 11/18/19

// class what a day!
// practicing conditional structures

// provide a random day of the week for a student
// using a helper method

import java.util.Scanner;

public class WhatADay
{
  
  private enum Season{SPRING, SUMMER, FALL, WINTER};
  private static Season season;
  
  public static void main(String[] args)
  { 
    // return a random day, month, and chosen nursery rhyme line
    System.out.println("Random day: " + randomDay());
    System.out.println("Random month: " + randomMonth());
    System.out.println("Season: " + season + " ... " + getSeasonSaying(season) + "\n");
    System.out.println("\nBuckle what? " + nurseryRhyme());
  }
  
  public static String randomDay()
  {
    int d = (int)(Math.random() * 7);
    
    // use switch statement
    switch(d)
    {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "Unknown";
    }
  }
  
  // nursery rhyme ask user # 1-8
  // return the correct line from
  // 1, 2, buckle your shoe
  // 3, 4, shut the door
  // 5, 6, pick up sticks
  // 7, 8, don't be late!
  public static String nurseryRhyme()
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Input integer from 1 to 8: ");
    int l = sc.nextInt();
    switch(l)
    {
      case 1:
      case 2:
        return "1, 2, buckle your shoe";
      case 3:
      case 4:
        return "3, 4, shut the door";
      case 5:
      case 6:
        return "5, 6, pick up sticks";
      case 7:
      case 8: 
        return "7, 8, don't be late!";
      default:
        return nurseryRhyme();
    }
  }
  
  // return random month
  public static String randomMonth()
  {
    int m = (int)(Math.random() * 12) + 1;
    String month = "";
    
    // use switch statement
    switch(m)
    {
      case 1:
        month = "January";
        season = Season.WINTER;
        break;
      case 2:
        month = "February";
        season = Season.WINTER;
        break;
      case 3:
        month = "March";
        season = Season.SPRING;
        break;
      case 4:
        month = "April";
        season = Season.SPRING;
        break;
      case 5:
        month = "May";
        season = Season.SPRING;
        break;
      case 6:
        month = "June";
        season = Season.SUMMER;
        break;
      case 7:
        month = "July";
        season = Season.SUMMER;
        break;
      case 8:
        month = "August";
        season = Season.SUMMER;
        break;
      case 9:
        month = "September";
        season = Season.FALL;
        break;
      case 10:
        month = "October";
        season = Season.FALL;
        break;
      case 11:
        month = "November";
        season = Season.FALL;
        break;
      case 12:
        month = "December";
        season = Season.WINTER;
        break;
      default:
        month = "Unknown";
        season = Season.SPRING;
    }
    return month;
  }
  
  public static String getSeasonSaying(Season s)
  {
    switch(s)
    {
      case SPRING:
        return "Spring is blooming";
      case SUMMER: 
        return "Summer is glowing";
      case FALL:
        return "Fall is arriving";
      case WINTER:
        return "Winter is freezing";
      default:
        return "Unknown";
    }
  }
  
}