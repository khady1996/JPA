package eu.ensup.monprojetjpa.service;

import java.util.Date;
import java.util.List;

import eu.ensup.monprojetjpa.domaine.Adresse;
import eu.ensup.monprojetjpa.domaine.Association;
import eu.ensup.monprojetjpa.domaine.Compte;
import eu.ensup.monprojetjpa.domaine.Eleve;
import eu.ensup.monprojetjpa.domaine.Login;
import eu.ensup.monprojetjpa.domaine.Personne;
import eu.ensup.monprojetjpa.domaine.Professeur;

public interface IService {

	public int ajouteLogin(Login log);

	public int ajouterAdresse(Adresse a);

	public int ajouterAssociation(Association assoc);

	public int ajouterCompte(Compte compte);

	public int ajouterEleve(Eleve el);

	public int ajouterPersonne(Personne p);

	public int ajouterPersonneAdresse(Adresse a, Personne p);

	public int ajouterPersonneAssociation(Association assoc, Personne p);

	public int ajouterPersonneCompte(Compte compte, Personne pers, Date dateAffiliation);

	public int ajouterPersonneLogin(Login log, Personne p);

	public int ajouterProfesseur(Professeur prof);

	public List<Personne> findAll();

	public List<Adresse> findAllAdresses();

	public Adresse getAdresse(int idAdresse);

	public Personne getPersonne(int idPersonne);

	public int modifierAdresse(Adresse a);

	public int modifierPersonne(Personne p);

	public int supprimerAdresse(int idAdresse);

	public int supprimerPersonne(int idPersonne);

}
