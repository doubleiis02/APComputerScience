// Jiin Kim
// period 2
// 10/1/19

// practicing creating our own fields, constructors, and methods for a class of our own

public class Pokemon
{
  private String name;
  private int level;
  private int hp;
  private String type;
  private int maxhp;
  private String move;
  
  public Pokemon(String name, int level, int hp, String type, int maxhp, String move)
  {
    this.name = name;
    this.level = level;
    this.hp = hp;
    this.type = type;
    this.maxhp = maxhp;
    this.move = move;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getLevel()
  {
    return level;
  }
  
  public int getHp()
  {
    return hp;
  }
  
  public String getType()
  {
    return type;
  }
  
  public String getMove()
  {
    return move;
  }
  
  public void levelUp()
  {
    level++;
    maxhp += 10;
    hp += 10;
  }
  
  public void sleep()
  {
    hp = maxhp;
  }
  
  public void eat(int f)
  {
    hp += f;
    if (hp > maxhp)
    {
      hp = maxhp;
    }
  }
  
  public void gotAttacked(int a)
  {
    hp -= a;
  }
  
  public String attack()
  {
    return name + " used " + move;
  }
  
  // tostring
  public String toString()
  { 
    return "Name: " + name + "\nType: " + type + "\nLevel: " + level + "\nHP: " + hp + "\nMove: " + move;
  }
  
  public static void main(String[] args)
  {
    Pokemon magikarp = new Pokemon("Magikarp", 2, 15, "water", 15, "splash");
    System.out.println(magikarp);
  }
}