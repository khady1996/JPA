package eu.ensup.monprojetjpa.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Adresse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAdresse;
	private String numRue;

	private String nomRue;
	private String codePostal;
	private String ville;
	@OneToMany(mappedBy = "adresse")
	private List<Personne> personnes = new ArrayList<>();

	public Adresse() {
		super();
	}

	public Adresse(String numRue, String nomRue, String codePostal, String ville) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public int getIdAdresse() {
		return idAdresse;
	}

	public String getNomRue() {
		return nomRue;
	}

	public String getNumRue() {
		return numRue;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public String getVille() {
		return ville;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", nomRue=" + nomRue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", personnes=" + personnes + "]";
	}

}
