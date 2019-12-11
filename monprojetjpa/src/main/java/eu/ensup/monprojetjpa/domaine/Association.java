package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Association implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAssociation;
	private String nomAssociation;
	@ManyToMany(mappedBy = "associations")
	private List<Personne> personnes = new ArrayList<>();

	public Association() {
		super();
	}

	public Association(String nomAssociation) {
		super();
		this.nomAssociation = nomAssociation;
	}

	public int getIdAssociation() {
		return idAssociation;
	}

	public String getNomAssociation() {
		return nomAssociation;
	}

	public void setIdAssociation(int idAssociation) {
		this.idAssociation = idAssociation;
	}

	public void setNomAssociation(String nomAssociation) {
		this.nomAssociation = nomAssociation;
	}

}
