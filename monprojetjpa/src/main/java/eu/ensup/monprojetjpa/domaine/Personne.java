package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
// 1. SINGLE TABLE : Pour tout regrouper dans la même table mère avec tous les attributs des filles
/*
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 *
 * @DiscriminatorColumn(name = "TYPE_PERSONNE")
 *
 * @DiscriminatorValue("PERSONNE")
 */

// 2. TABLE PER CLASS : chaque classe mère + filles est représentée par une table en base de données
/* @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) */

@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) /*
													 * ne marche pas avec la méthode TABLE PER CLASS mais OUI pour le
													 * reste
													 */
	/*
	 * @GeneratedValue(strategy = GenerationType.TABLE) avec la méthode TABLE PER
	 * CLASS
	 */
	private int id;
	private String nom;
	private String prenom;
	@ManyToOne
	private Adresse adresse;
	@OneToOne
	private Login login;
	@ManyToMany
	private List<Association> associations = new ArrayList<>();
	@OneToMany(mappedBy = "id.personne")
	private List<PersonneCompte> personnesComptes = new ArrayList<>();

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public List<Association> getAssociations() {
		return associations;
	}

	public int getId() {
		return id;
	}

	public Login getLogin() {
		return login;
	}

	public String getNom() {
		return nom;
	}

	public List<PersonneCompte> getPersonnesComptes() {
		return personnesComptes;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setAssociations(List<Association> associations) {
		this.associations = associations;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPersonnesComptes(List<PersonneCompte> personnesComptes) {
		this.personnesComptes = personnesComptes;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", login="
				+ login + "]";
	}

}
