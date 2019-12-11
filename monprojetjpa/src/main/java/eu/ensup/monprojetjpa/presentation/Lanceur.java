package eu.ensup.monprojetjpa.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Lanceur {
	public static void main(String[] args) {
		// TODO 1. Création de l'unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("monprojetjpa");
		EntityManager em = emf.createEntityManager();

//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
	}
}
