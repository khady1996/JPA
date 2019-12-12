package eu.ensup.monprojetjpa.domaine;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PROF") avec la méthode TABLE PER CLASS
public class Professeur extends Personne {

	private String matiere;

	public Professeur(String nom, String prenom, String matiere) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
		this.matiere = matiere;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
