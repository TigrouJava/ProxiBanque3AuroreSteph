package org.formation.service;

import java.util.List;
import org.formation.model.Client;

public interface IServiceClient {

	List<Client> getClients() throws Exception;

	void addClient(Client cli) throws Exception;

	Client getClient(long idClient) throws Exception;

	//void updateClient(long id) throws Exception;

	void deleteClient(long idClient) throws Exception;

	void updateClient(Client cli) throws Exception;
}
