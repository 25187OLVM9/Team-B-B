package h14_qz1;


public abstract class MijnAbstract
{
  protected int x = 6;
  public MijnAbstract()
  {
    x += 2;
  }
  abstract int bereken(int x);
}
