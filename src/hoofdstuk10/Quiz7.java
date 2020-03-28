
package hoofdstuk10;

import java.util.ArrayList;

/**
 * @author jordi
 *
 */
public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<String> landen = new ArrayList<String>();
		landen.add("Duitsland");
		landen.add("Verenigde Staten");
		landen.add("Rusland");
		landen.add("Verenigd koninkrijk");
		landen.add(2, "India");
		
		for(int i = 0; i < landen.size(); i ++) {
			System.out.print(" " + landen.get(i));
		}
		
		boolean b = landen.isEmpty();
		System.out.println("\n" + b);
		boolean b2 = landen.contains("Spanje");
		System.out.println(b2);
		boolean b3 = landen.contains("India");
		System.out.println(b3);
		int index = landen.indexOf("Rusland");
		System.out.println(index);
		int arraySize = landen.size();
		System.out.println(arraySize);
		landen.remove("Duitsland");
		System.out.println(landen);
	}

}
