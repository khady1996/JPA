package eu.ensup.monprojetjpa.presentation;

import java.util.Date;

import eu.ensup.monprojetjpa.domaine.Compte;
import eu.ensup.monprojetjpa.domaine.Personne;
import eu.ensup.monprojetjpa.service.IService;
import eu.ensup.monprojetjpa.service.ServiceImpl;

public class Lanceur {
	public static void main(String[] args) {
		// TODO 1. Création de l'unité de travail
		IService service = new ServiceImpl();
		// -- Creation d'une personne

		/*
		 * Personne personne = new Personne("NDIAYE", "Khady");
		 * service.ajouterPersonne(personne);
		 */

		/*
		 * Adresse adresse = new Adresse("5t", "marcellin", "94500", "Champigny");
		 * service.ajouterAdresse(adresse);
		 */
		Personne pers2 = service.getPersonne(2);
		/*
		 * Adresse adress2 = service.getAdresse(1);
		 * service.ajouterPersonneAdresse(adress2, pers2);
		 */

		// passer par getXxx(PrimaryKey)

//		Eleve stud = new Eleve("fall", "yacine", 20);
//		service.ajouterEleve(stud);
//		Professeur prof = new Professeur("mbiandou", "Douglas", "GTM");
//		service.ajouterProfesseur(prof);
		// Relation OneToOne
		/*
		 * Login connex = new Login("username", "pwd"); service.ajouteLogin(connex);
		 * service.ajouterPersonneLogin(connex, pers2);
		 */

		/*
		 * Personne pers2 = service.getPersonne(1); System.out.println(pers2);
		 * pers2.setNom("Maman"); service.modifierPersonne(pers2);
		 */

		// Relation ManyToOne
		/*
		 * Association assoc = new Association("DREAM WORLD");
		 * service.ajouterAssociation(assoc); service.ajouterPersonneAssociation(assoc,
		 * pers2);
		 */

		// Relation ManyToMany
		Compte compte = new Compte("1245", new Date());
		service.ajouterCompte(compte);
		service.ajouterPersonneCompte(compte, pers2, new Date());

		// service.supprimerPersonne(1);

	}
}
