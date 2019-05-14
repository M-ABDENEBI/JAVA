package tesrtster.test.Exercice2;

public class Employe {
	String nom;
	String prenom;
	int age;
	String dateEntreeService;
	int salaire;

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Employe(String nom, String prenom, int age, String dateEntreeService) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntreeService = dateEntreeService;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateEntreeService() {
		return dateEntreeService;
	}

	public void setDateEntreeService(String dateEntreeService) {
		this.dateEntreeService = dateEntreeService;
	}

	@Override
	public String toString() {
		return "L'employé " + this.nom +" " +this.prenom + " XXXXXX à un salaire de " + this.salaire + "€";
	}
}