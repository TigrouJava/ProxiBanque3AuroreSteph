package org.formation.dao;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;
/**
 * Data access object compte, où sont gérées les opérations de création, modification, suppression des comptes et leur persistance.
 */

@Named
@ApplicationScoped
public class DaoCompte implements IDaoCompte, Serializable {

	
	private static final long serialVersionUID = -2998355525195594138L;

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	/**
	 * Implémentation des méthodes CRUD pour les comptes courants (Création, Modification, Délétion, Récupération).
	 *
	 */
	@Override
	public void ajouterCompteC(CompteCourant cc) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();

			em.persist(cc);

			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	@Override
	public CompteCourant getCompteC(long idCompteC) throws Exception {
		CompteCourant cc = new CompteCourant();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			cc = em.find(CompteCourant.class, idCompteC);

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return cc;
	}

	@Override
	public void modifierCompteC(CompteCourant cc) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			System.out.println("test");
			em.merge(cc);
			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	@Override
	public void suppressionCompteC(long idCompteC) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			CompteCourant cc = em.find(CompteCourant.class, idCompteC);
			em.remove(cc);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	/**
	 * Implémentation des méthodes CRUD pour les comptes épargnes (Création, Modification, Délétion, Récupération).
	 *
	 */
	
	@Override
	public void ajouterCompteE(CompteEpargne ce) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();

			em.persist(ce);

			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	@Override
	public CompteEpargne getCompteE(long idCompteE) throws Exception {
		CompteEpargne ce = new CompteEpargne();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			ce = em.find(CompteEpargne.class, idCompteE);

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return ce;
	}

	@Override
	public void modifierCompteE(CompteEpargne ce) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			System.out.println("test");
			em.merge(ce);
			txn.commit();
			
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	@Override
	public void suppressionCompteE(long idCompteE) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			CompteEpargne ce = em.find(CompteEpargne.class, idCompteE);
			em.remove(ce);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
