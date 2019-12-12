package eu.ensup.monprojetjpa.service;

import java.util.Date;
import java.util.List;

import eu.ensup.monprojetjpa.dao.DaoImpl;
import eu.ensup.monprojetjpa.dao.IDao;
import eu.ensup.monprojetjpa.domaine.Adresse;
import eu.ensup.monprojetjpa.domaine.Association;
import eu.ensup.monprojetjpa.domaine.Compte;
import eu.ensup.monprojetjpa.domaine.Eleve;
import eu.ensup.monprojetjpa.domaine.Login;
import eu.ensup.monprojetjpa.domaine.Personne;
import eu.ensup.monprojetjpa.domaine.Professeur;

public class ServiceImpl implements IService {

	private IDao dao = new DaoImpl();

	@Override
	public int ajouteLogin(Login log) {
		// TODO Auto-generated method stub
		return dao.ajouterLogin(log);
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdresse(a);
	}

	@Override
	public int ajouterAssociation(Association assoc) {
		// TODO Auto-generated method stub
		return dao.ajouterAssociation(assoc);
	}

	@Override
	public int ajouterCompte(Compte compte) {
		// TODO Auto-generated method stub
		return dao.ajouterCompte(compte);
	}

	@Override
	public int ajouterEleve(Eleve el) {
		// TODO Auto-generated method stub
		return dao.ajouterEleve(el);
	}

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public int ajouterPersonneAdresse(Adresse a, Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonneAdresse(a, p);
	}

	@Override
	public int ajouterPersonneAssociation(Association assoc, Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonneAssociation(assoc, p);
	}

	@Override
	public int ajouterPersonneCompte(Compte compte, Personne pers, Date dateAffiliation) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonneCompte(compte, pers, dateAffiliation);
	}

	@Override
	public int ajouterPersonneLogin(Login log, Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonneLogin(log, p);
	}

	@Override
	public int ajouterProfesseur(Professeur prof) {
		// TODO Auto-generated method stub
		return dao.ajouterProfesseur(prof);
	}

	@Override
	public List<Adresse> findAdressesPersonnes() {
		// TODO Auto-generated method stub
		return dao.findAdressesPersonnes();
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return dao.findAllAdresses();
	}

	@Override
	public List<Association> findAssociationsPersonnnes() {
		// TODO Auto-generated method stub
		return dao.findAssociationsPersonnnes();
	}

	@Override
	public List<Personne> findbyMotClé(String keyword) {
		// TODO Auto-generated method stub
		return dao.findbyMotClé(keyword);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.getAdresse(idAdresse);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idPersonne);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.modifierAdresse(a);
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}

	@Override
	public int supprimerAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.supprimerAdresse(idAdresse);
	}

	@Override
	public int supprimerPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(idPersonne);
	}

}
