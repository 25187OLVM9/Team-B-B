package hoofdstuk12;

import java.util.ArrayList;

public class SchoolApp {

	private static ArrayList<Student> klasA = new ArrayList<Student>();
	public static void main(String[] args) {
		voegToe(klasA, new Student("Hector ","12442938","0614455776"));
		voegToe(klasA, new Student("Marijke ","63529438","0633435576"));
		voegToe(klasA, new Student("Lodewijk","17292277","0679847211"));
		printOverzicht(klasA);
	}

	public static void voegToe(ArrayList<Student> lijst, Student eenStudent) {
		lijst.add(eenStudent);
	}

	public static void printOverzicht(ArrayList<Student> lijst) {
		for (Student eenStudent : lijst) {
			System.out.println("Mijn naam is : "+ eenStudent.getNaam()+" en mijn telefoonnummer is : "+ eenStudent.getTelefoonnummer());
		}
	}
}
