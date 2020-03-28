
package hoofdstuk10;

import java.util.Arrays;

/**
 * @author jordi
 *
 */
public class Quiz5 {

	public static void main(String[] args) {
		
		char[] arrCharA = new char[4];
		arrCharA[0] = 'w';
		arrCharA[1] = 'k';
		arrCharA[2] = 'd';
		arrCharA[3] = 'r';
		
		char[] arrCharB = Arrays.copyOf(arrCharA, arrCharA.length);
		//de index van het element 'k'
		int i = Arrays.binarySearch(arrCharA, 'k');
		//controleer of de twee arrays gelijk zijn 
		boolean b = Arrays.equals(arrCharA, arrCharB);
		
		System.out.println(i + " " + b);
		
		char[] arrayChar = new char[8];
		arrayChar[0] = 'R';
		arrayChar[1] = 'N';
		arrayChar[2] = 'B';
		arrayChar[3] = 'S';
		arrayChar[4] = 'M';
		arrayChar[5] = 'O';
		arrayChar[6] = 'A';
		arrayChar[7] = 'C';
		
		boolean b2 = Arrays.equals(arrayChar, arrCharA);
		System.out.println(b2);
		
		Arrays.sort(arrayChar);
		System.out.println(arrayChar);
		

	}

}
