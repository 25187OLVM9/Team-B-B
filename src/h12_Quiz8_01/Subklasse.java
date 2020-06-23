package h12_Quiz8_01;

import h12_Quiz8_02.Superklasse;

public class Subklasse extends Superklasse {

	public static void main(String[] args) {
		
		Superklasse supK = new Superklasse();
		Subklasse subK = new Subklasse();
		
		System.out.print(supK.str1);
		//System.out.print(supK.str2);
		//System.out.print(supK.str3);
		//System.out.print(supK.str4);
		System.out.print(subK.str2);
		
		//System.out.print(supK.mijnInt);
		System.out.print(subK.mijnInt);

	}

}
