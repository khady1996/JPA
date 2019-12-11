package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class PersonneCompteId implements Serializable {
	@ManyToOne
	private Personne personne;
	@ManyToOne
	private Compte compte;

	public PersonneCompteId() {
		super();
	}

	public Compte getCompte() {
		return compte;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
