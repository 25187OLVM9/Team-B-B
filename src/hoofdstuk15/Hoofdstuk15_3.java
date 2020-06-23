package hoofdstuk15;

public class Hoofdstuk15_3 {

	public interface MijnInterface
	{
		int x = 4;

		void mijnMethode();
		void mijnMethode(String str);
	}
	public abstract class Superklasse implements MijnInterface
	{
		public void mijnMethode()
		{
			System.out.print("m" + x);
		}
	}
	public class MijnKlasse extends Superklasse
	{
		int x = 6;

		public void mijnMethode(String s)
		{
			mijnMethode();
			System.out.print("q" + s + x);
		}
		public static void main(String[] args)
		{
			MijnKlasse mk = new MijnKlasse();
			mk.mijnMethode("w");
		}
	}

}
