package eu.ensup.monprojetjpa.dao;

import java.util.Date;
import java.util.List;

import eu.ensup.monprojetjpa.domaine.Adresse;
import eu.ensup.monprojetjpa.domaine.Association;
import eu.ensup.monprojetjpa.domaine.Compte;
import eu.ensup.monprojetjpa.domaine.Eleve;
import eu.ensup.monprojetjpa.domaine.Login;
import eu.ensup.monprojetjpa.domaine.Personne;
import eu.ensup.monprojetjpa.domaine.Professeur;

public interface IDao {

	public int ajouterAdresse(Adresse a);

	public int ajouterAssociation(Association assoc);

	public int ajouterCompte(Compte compte);

	public int ajouterEleve(Eleve el);

	public int ajouterLogin(Login log);

	public int ajouterPersonne(Personne p);

	public int ajouterPersonneAdresse(Adresse a, Personne p);

	public int ajouterPersonneAssociation(Association assoc, Personne p);

	public int ajouterPersonneCompte(Compte compte, Personne p, Date dateAffiliation);

	public int ajouterPersonneLogin(Login log, Personne p);

	public int ajouterProfesseur(Professeur prof);

	public List<Adresse> findAdressesPersonnes();

	public List<Personne> findAll();

	public List<Adresse> findAllAdresses();

	public List<Association> findAssociationsPersonnnes();

	public List<Personne> findbyMotClé(String keyword);

	public Adresse getAdresse(int idAdresse);

	public Personne getPersonne(int idPersonne);

	public int modifierAdresse(Adresse a);

	public int modifierPersonne(Personne p);

	public int supprimerAdresse(int idAdresse);

	public int supprimerPersonne(int idPersonne);

}
