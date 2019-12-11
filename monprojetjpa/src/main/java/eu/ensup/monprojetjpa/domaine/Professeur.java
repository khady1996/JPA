package eu.ensup.monprojetjpa.domaine;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PROF") avec la méthode TABLE PER CLASS
public class Professeur extends Personne {

	private String matiere;

	public Professeur() {
		// TODO Auto-generated constructor stub
	}

	public Professeur(String matiere) {
		super();
		this.matiere = matiere;
	}

	public Professeur(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
