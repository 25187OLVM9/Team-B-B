package hoofdstuk10;

import java.util.ArrayList;

public class Quiz8_College
{
  ArrayList<Quiz8_Student> studentenlijst = new ArrayList<Quiz8_Student>();
  public void studentToevoegen()
  {
    Quiz8_Student st1 = new Quiz8_Student("Lars", 24, "lars@itmail.com");
    Quiz8_Student st2 = new Quiz8_Student("Isa ", 22, "isa@dzork.com");
    Quiz8_Student st3 = new Quiz8_Student("Thomas", 33, "thomas@ysmail.com");
    Quiz8_Student st4 = new Quiz8_Student("Susan", 25, "susan@rzmail.com");
    studentenlijst.add(st1);
    studentenlijst.add(st2);
    studentenlijst.add(st3);
    studentenlijst.add(st4);
  }
  public static void main(String[] args)
  {
    Quiz8_College cl = new Quiz8_College();
    cl.studentToevoegen();
    for (int i = 0; i < cl.studentenlijst.size(); i++)
    {
      if (i == 2)
      {
        System.out.println(cl.studentenlijst.get(i).naam + ", "
            + cl.studentenlijst.get(i).leeftijd + ", "
            + cl.studentenlijst.get(i).email);
      }
    }
  }
}
