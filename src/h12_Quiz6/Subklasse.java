package h12_Quiz6;

public class Subklasse extends Superklasse { 
	
	char e = 'p';
	
	void mijnMethode() {
		
		x ++;
		System.out.print(e);
		super.mijnMethode();
		x += 2;
		System.out.print(x);
	}

	public static void main(String[] args) {
		
		Subklasse sk = new Subklasse();
		sk.mijnMethode();

	}

}
