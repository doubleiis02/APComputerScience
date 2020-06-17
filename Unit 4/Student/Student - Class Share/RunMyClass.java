// Run a Test of MyClass working with Student and Assignment objects
// imports a txt file of a list of students
import java.util.ArrayList;
import java.text.DecimalFormat;
public class RunMyClass
{
  public static void main(String[] args)
  {
    
    MyClass mc = new MyClass("AP Computer Science", 2, "period2.txt");
    System.out.println(mc.getClassName() + " (Period " + mc.getPeriod() + ")");
    System.out.println("Student implements StuInfo: " + (mc.get(0) instanceof StuInfo));
    System.out.println("Student implements Stu: " + (mc.get(0) instanceof Stu));
    System.out.println("***************************************************");
    System.out.println("Class Average Grade Average: " + mc.getClassAverages());
    System.out.println("Class Lowest Grade Average: " + mc.getMinAverage() + " - " + mc.getMinStudent().getName());
    System.out.println("Class Highest Grade Average: " + mc.getMaxAverage() + " - " + mc.getMaxStudent().getName());
    System.out.println("***************************************************");
    
    for(Student s : mc)
      System.out.println(s);

  }
    
  
  
  public static int menu(ArrayList<Student> list)
  {
    String[] items = new String[list.size()];
    for(int i = 0; i < list.size(); i++)
      items[i] = list.get(i).getName();
    Menu m = new Menu(items);
    return m.showMenu();
  }
}