package eu.ensup.monprojetjpa.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import eu.ensup.monprojetjpa.domaine.Adresse;
import eu.ensup.monprojetjpa.domaine.Association;
import eu.ensup.monprojetjpa.domaine.Compte;
import eu.ensup.monprojetjpa.domaine.Eleve;
import eu.ensup.monprojetjpa.domaine.Login;
import eu.ensup.monprojetjpa.domaine.Personne;
import eu.ensup.monprojetjpa.domaine.PersonneCompte;
import eu.ensup.monprojetjpa.domaine.PersonneCompteId;
import eu.ensup.monprojetjpa.domaine.Professeur;

public class DaoImpl implements IDao {

	EntityManagerFactory emf;
	EntityManager em;

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(a);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterAssociation(Association assoc) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(assoc);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterCompte(Compte compte) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(compte);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterEleve(Eleve el) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(el);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterLogin(Login log) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(log);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(p);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterPersonneAdresse(Adresse a, Personne p) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			p.setAdresse(a);
			em.merge(p);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterPersonneAssociation(Association assoc, Personne p) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		p.getAssociations().add(assoc);
		try {
			tx.begin();

			em.merge(p);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterPersonneCompte(Compte compte, Personne pers, Date dateAffiliation) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			PersonneCompteId id = new PersonneCompteId();
			id.setCompte(compte);
			id.setPersonne(pers);

			PersonneCompte moncompte = new PersonneCompte(id, dateAffiliation);
			em.persist(moncompte);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterPersonneLogin(Login log, Personne p) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			p.setLogin(log);
			em.merge(p);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int ajouterProfesseur(Professeur prof) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(prof);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public List<Personne> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();

		Adresse adresse = em.getReference(Adresse.class, idAdresse);
		return adresse;
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();

		Personne personne = em.getReference(Personne.class, idPersonne);
		return personne;
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(a);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.merge(p);
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int supprimerAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(em.getReference(Adresse.class, idAdresse));
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

	@Override
	public int supprimerPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("monprojetjpa");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(em.getReference(Personne.class, idPersonne));
			tx.commit();
			em.close();
			emf.close();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			tx.rollback();
			return 0;
		}
	}

}
