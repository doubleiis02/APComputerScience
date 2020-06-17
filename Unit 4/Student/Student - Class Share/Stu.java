// an interface to use with Student

public interface Stu
{
  public Assignment getGrade(String title);
  public void addGrade(Assignment grade);
  public Assignment removeGrade(int index);
  public double getGradeAverage();
  public double getMaxGrade();
  public double getMinGrade();
  public void printAllGrades();
}