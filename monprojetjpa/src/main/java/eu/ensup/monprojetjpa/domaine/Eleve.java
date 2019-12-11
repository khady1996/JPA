package eu.ensup.monprojetjpa.domaine;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("ELEVE") avec la méthode TABLE PER CLASS
public class Eleve extends Personne {
	private float moyenne;

	public Eleve() {
		// TODO Auto-generated constructor stub
	}

	public Eleve(String nom, String prenom, float moyenne) {
		super(nom, prenom);
		this.moyenne = moyenne;
		// TODO Auto-generated constructor stub
	}

	public float getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}

}
