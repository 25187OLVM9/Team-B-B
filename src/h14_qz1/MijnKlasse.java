package h14_qz1;


public class MijnKlasse extends MijnAbstract
{
  int bereken()
  {
    return x + 5;
  }
  int bereken(int x)
  {
    return super.x + x;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    System.out.print(mk.bereken(4));
  }
}
