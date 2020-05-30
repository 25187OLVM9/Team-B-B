
package hoofdstuk13;

/**
 * @author jordi
 * Date: 30-05-2020
 */
public class Quiz4_sub extends Quiz4_super {
	
	void methodeA(int x, int y) {
		int z = x - y;
		System.out.print(z);
	}

	public static void main(String[] args) {
		
		Quiz4_sub mk = new Quiz4_sub();
		mk.methodeA(6, 4);

	}

}
