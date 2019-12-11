package eu.ensup.monprojetjpa.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idLogin;
	private String login;
	private String motdepasse;
	@OneToOne(mappedBy = "login")
	private Personne personne;

	public Login() {
		super();
	}

	public Login(String login, String motdepasse) {
		super();
		this.login = login;
		this.motdepasse = motdepasse;
	}

	public int getIdLogin() {
		return idLogin;
	}

	public String getLogin() {
		return login;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", login=" + login + ", motdepasse=" + motdepasse + ", personne="
				+ personne + "]";
	}

}
