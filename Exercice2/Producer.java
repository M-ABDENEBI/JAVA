package tesrtster.test.Exercice2;

public class Producer extends Employe {

	public Producer(String nom, String prenom, int age, String dateEntreeService, int salaire) {
		super(nom, prenom, age, dateEntreeService);
		this.salaire = salaire + 400;
	}

}