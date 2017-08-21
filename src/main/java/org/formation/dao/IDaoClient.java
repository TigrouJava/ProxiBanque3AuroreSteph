package org.formation.dao;

import java.util.List;
import org.formation.model.Client;

/**
 * Déclaration des méthodes CRUD pour la classe métier "Client" (Création, Modification, Délétion, Récupération).
 *
 */

public interface IDaoClient {

	List<Client> getClients() throws Exception;
	
	void addClient (Client cli) throws Exception;
	
	Client getClient(long idClient) throws Exception;
	
	void updateClient(Client cli) throws Exception;
	
	void deleteClient(long idClient) throws Exception;

	//void updateClient(long id) throws Exception;
	
}
