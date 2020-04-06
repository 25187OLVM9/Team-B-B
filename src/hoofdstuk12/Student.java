package hoofdstuk12;

public class Student {

	private String naam;
	private String studentnummer;
	private String telefoonnummer;

	Student(String nm, String studentnummer, String telefoonnummer) {
		naam=nm;
		this.telefoonnummer=telefoonnummer;
		this.studentnummer=studentnummer;
	}

	public String getNaam() { return naam; }
	public String getStudentnummer() { return studentnummer; }
	public String getTelefoonnummer() { return telefoonnummer; }

	@Override
	public String toString() {
		return "Student [naam=" + naam + ", studentnummer=" + studentnummer + ", " + "telefoonnummer=" + telefoonnummer + "]";
	}

}