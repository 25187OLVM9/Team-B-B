package h14_qz2;

public class Subklasse extends Superklasse
{
  Subklasse()
  {
    System.out.print("p");
  }
  public static void main(String[] args)
  {
    new Subklasse().printLetter('s');
  }
}
