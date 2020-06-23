
package hoofdstuk13;

/**
 * @author jordi
 * Date: 30-05-2020
 */
public class Quiz3_sub extends Quiz3_super {
	
	int x = 3;
	
	String methodeA(String s, int i) {
		String str = s + ", " + i;
		//super.x ++;
		//kan variabele x niet aanpassen omdat het super is
		return str;
	}

	public static void main(String[] args) {
		
		Quiz3_sub mk = new Quiz3_sub();
		System.out.print(mk.methodeA(23, "Emma"));

	}

}
