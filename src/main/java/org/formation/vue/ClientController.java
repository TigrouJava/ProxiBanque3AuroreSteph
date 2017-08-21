package org.formation.vue;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.faces.taglib.html_basic.DataTableTag;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIData;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;


import org.formation.model.Client;
import org.formation.service.IServiceClient;




@Named
@SessionScoped
public class ClientController implements Serializable{

	private static final long serialVersionUID = 3774463683041113840L;
	
	private List<Client> clients;
	
	private static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

	@Inject
	private IServiceClient service;

	
	
	
	public void loadClients() {

		LOGGER.debug("lister clients");
		LOGGER.info("information");

		//clients.clear();

		try {
			clients = service.getClients();

		} catch (Exception exc) {
			LOGGER.error("Error loading clients", exc);
			addErrorMessage(exc);
		}
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	
	public String addClient(Client client) {

		LOGGER.info("Adding client: " + client);

		try {
			service.addClient(client);
		} catch (Exception exc) {
			LOGGER.error("Error adding clients", exc);
			addErrorMessage(exc);
			return null;
		}

		return "list-clients?faces-redirect=true";
	}
	
	
	public String loadClient(long clientId) {

		//LOGGER.info("loading client: " + clientId);

		try {
			
			Client client = service.getClient(clientId);
			

			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("client", client);
			
		} catch (Exception exc) {
			
			//LOGGER.error("Error loading client id:" + clientId, exc);

			addErrorMessage(exc);

			return null;
		}
		

		return "update-client.xhtml";
	}
	
	public String readClient(long clientId) {

		//LOGGER.info("loading client: " + clientId);

		try {
			
			Client client = service.getClient(clientId);
			

			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("clt", client);
			
		} catch (Exception exc) {
			
			//LOGGER.error("Error loading client id:" + clientId, exc);

			addErrorMessage(exc);

			return null;
		}
		

		return "client-details.xhtml";
	}
//	
//	public String updateClient(long clientId) {
//
//		LOGGER.info("updating client: " + clientId);
//
//		try {
//
//			service.updateClient(clientId);
//
//		} catch (Exception exc) {
//			
//			//LOGGER.log(Level.SEVERE, "Error updating client: " + client, exc);
//
//			
//			addErrorMessage(exc);
//
//			return null;
//		}
//
//		return "list-clients?faces-redirect=true";
//	}


	public String updateClient(Client cli) {

		//LOGGER.info("updating client: " + clientId);

		try {

			service.updateClient(cli);

		} catch (Exception exc) {
			
			//LOGGER.log(Level.SEVERE, "Error updating client: " + client, exc);

			
			addErrorMessage(exc);

			return null;
		}

		return "list-clients?faces-redirect=true";
	}
	
	public String deleteClient(int clientId) {

		LOGGER.info("Deleting client id: " + clientId);

		try {

	
			service.deleteClient(clientId);

		} catch (Exception exc) {
			
			//LOGGER.log(Level.SEVERE, "Error deleting client id: " + clientId, exc);

			
			addErrorMessage(exc);

			return null;
		}

		return "list-clients";
	}
	
	
	
	
	
	
	
	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public String logOut() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		externalContext.invalidateSession();
		return "index";
	}
	
	

	
}
