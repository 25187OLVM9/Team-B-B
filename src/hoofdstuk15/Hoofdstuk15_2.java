package hoofdstuk15;

public class Hoofdstuk15_2 {

	public interface InterfaceA
	{
		void mijnMethode();
		void mijnMethode(char c);
	}

	public interface InterfaceB
	{ 
		int MAX_TOEGESTAAN = 3;
		int som();
	}
	Public class MijnKlasse implements InterfaceA, InterfaceB
	{
		int z = 2;
		public void mijnMethode()
		{
			z = MAX_TOEGESTAAN + 4;
			System.out.print("H");
		}
		public void mijnMethode(char j)
		{
			mijnMethode();
			System.out.print(j);
			System.out.print(z);
		}
		public int som()
		{
			return MAX_TOEGESTAAN + z;
		}
		public static void main(String[] args)
		{
			MijnKlasse mk = new MijnKlasse();
			mk.mijnMethode('K');
		}
	}
}
