7/**
 * 
 */
package hoofdstuk15;

public class Televisie implements ArtikelInterface
{
	double prijs = 420;
	double korting = 0.30;
	boolean isZestigplusser
	
	public double prijsMetKorting()
	{
		if(isZestigplusser)
		{
			korting = 0.40;
		
		}
		return prijs - (orijs * korting);
	}
}
public class TestProgamma
{
	public static void main(String[] args)
	{
		Televisie tv = new Televisie();
		Televisie tv2 = new Televisie();
		tv.isZestigplusser = true;
		tv2.isZestigplusser = false;
		
		Tablet tab = new Tablet();
		Tablet tab2 = new Tablet();
		tab.isStudent = true;
		tab2.isStudent = false;
		
		System.out.println("Televisie");
		System.out.println("Prijs met korting: " + tv.prijsMetKorting());
		System.out.println("Prijs met korting: " + tv2.prijsMetKorting());
		System.out.println("Tablet");
		System.out.println("Prijs met korting: " + tab.prijsMetKorting());
		System.out.println("Prijs met korting: " + tab2.prijsMetKorting());
	}
}