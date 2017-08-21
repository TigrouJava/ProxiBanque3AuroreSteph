package org.formation.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.formation.model.Client;

/**
 *@author Aurore Lions, Stéphanie Woerner
 * Data access object client, où sont gérées les opérations de création, modification, suppression des clients et leur persistance.
 */

@Named
@ApplicationScoped
public class DaoClient implements IDaoClient, Serializable{

private static final long serialVersionUID = 3419878067816749510L;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
	
	@Override
	public List<Client> getClients() throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		List<Client> listeCli = new ArrayList<>();
		
		try {
			txn.begin();
			
			TypedQuery<Client> query = em.createQuery("from Client", Client.class);
			listeCli = query.getResultList();
			
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
		return listeCli;
	}

	@Override
	public void addClient(Client cli) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();

			em.persist(cli);

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
	public Client getClient(long idClient) throws Exception {
		
		Client client = new Client();
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			client = em.find(Client.class, idClient);

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
		return client;
	}

//	@Override
//	public void updateClient(long id) throws Exception {
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction txn = em.getTransaction();
//		
//		try {
//			txn.begin();
//			Client cli = em.find(Client.class, id);
//			System.out.println("test");
//			em.merge(cli);
//			txn.commit();
//			
//		} catch (Exception e) {
//			if (txn != null) {
//				txn.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			if (em != null) {
//				em.close();
//			}
//		}
//	}

	@Override
	public void updateClient(Client cli) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			//Client cli = em.find(Client.class, id);
			System.out.println("test");
			em.merge(cli);
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
	public void deleteClient(long idClient) throws Exception {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		try {
			txn.begin();
			Client client = em.find(Client.class, idClient);
			em.remove(client);
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
