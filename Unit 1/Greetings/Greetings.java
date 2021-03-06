// Greetings Program
// Jiin Kim
// 8/29/19
// period 2
// create a program that prints out a greeting

// jdk path: c:\program files\java\jdk1.8.0_191\bin;%path%

public class Greetings
{
  public static void main(String[] args)
  {
    String first = args[0];
    String last = args[1];

    System.out.println("Hello, " + first + " " + last);
    System.out.println("Congratulations on your second program!");

    // add an output line which prints "Hurray (person's first name)!"
    System.out.println ("Hurray " + first + "!");
  }
}

// to run, type java Greetings arg[0] arg[1]
// ex: java Greetings Jiin Kim -> Hello, Jiin Kim