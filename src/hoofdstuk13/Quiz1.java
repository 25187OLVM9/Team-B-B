
package hoofdstuk13;

/**
 * @author jordi
 * Date: 29-05-2020
 */
final public class Quiz1 {
	
	final int X = 3;
	
	int bereken(int y, int z) {
		
		if(y >= z) {
			return y + X;
		}
		else {
			//y = 5;
			//z += 3;
			//z = X / 2;
			//int X = 6;
			//X ++;
			return z + X;
		}
	}

	public static void main(String[] args) {
		
		Quiz1 mk = new Quiz1();
		System.out.print(mk.bereken(4, 6));

	}

}
