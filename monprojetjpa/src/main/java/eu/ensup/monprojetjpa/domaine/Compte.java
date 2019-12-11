package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompte;
	private String numeroCompte;
	private Date dateCreation;
	@OneToMany(mappedBy = "id.compte")
	private List<PersonneCompte> personnesComptes = new ArrayList<>();

	public Compte() {
		super();
	}

	public Compte(String numeroCompte, Date dateCreation) {
		super();
		this.numeroCompte = numeroCompte;
		this.dateCreation = dateCreation;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public List<PersonneCompte> getPersonnesComptes() {
		return personnesComptes;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public void setPersonnesComptes(List<PersonneCompte> personnesComptes) {
		this.personnesComptes = personnesComptes;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numeroCompte=" + numeroCompte + ", dateCreation=" + dateCreation
				+ "]";
	}

}
