package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PersonneCompte implements Serializable {
	@EmbeddedId
	private PersonneCompteId id;
	private Date dateAffiliation;

	public PersonneCompte() {
		super();
	}

	public PersonneCompte(Date dateAffiliation) {
		super();
		this.dateAffiliation = dateAffiliation;
	}

	public Date getDateAffiliation() {
		return dateAffiliation;
	}

	public PersonneCompteId getId() {
		return id;
	}

	public void setDateAffiliation(Date dateAffiliation) {
		this.dateAffiliation = dateAffiliation;
	}

	public void setId(PersonneCompteId id) {
		this.id = id;
	}
}
