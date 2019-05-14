package tesrtster.test.Exercice2;

import java.util.ArrayList;
import java.util.List;

public class Staff {
  List<Employe> test;
  public Staff(){
    test = new ArrayList<Employe>();
  }
  public void add(Employe employer){
    test.add(employer);
  }
  public void displaySalaries(){
    System.out.println("Liste des salaires des employés :");
    for (Employe i : this.test) { 
    	System.out.println(i.toString());
    }
  }
  public void displayAverageSalary(){
    int moyen=0;
    for (Employe i : this.test) { 
      moyen= moyen +i.getSalaire();
    }
     System.out.println("Valeur du salaire moyen :"+ moyen/test.size()+" €");
  }
}