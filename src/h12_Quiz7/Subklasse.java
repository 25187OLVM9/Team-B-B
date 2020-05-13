package h12_Quiz7;

public class Subklasse extends Superklasse {
	
	Subklasse(String naam) {
		
		super("s");
		System.out.print(naam);
	}

	public static void main(String[] args) {
		
		Subklasse sk = new Subklasse("x");

	}

}
