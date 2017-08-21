package org.formation.dao;

import java.util.List;
import org.formation.model.Client;

/**
 * D�claration des m�thodes CRUD pour la classe m�tier "Client" (Cr�ation, Modification, D�l�tion, R�cup�ration).
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
