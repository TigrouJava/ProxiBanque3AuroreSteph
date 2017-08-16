package org.formation.vue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.formation.model.Client;
import org.formation.service.IServiceClient;



@Named
@SessionScoped
public class ClientController implements Serializable{

	private static final long serialVersionUID = 3774463683041113840L;

	private List<Client> clients;
	private Logger logger = Logger.getLogger(getClass().getName());

	@Inject
	private IServiceClient service;

	public ClientController() throws Exception {
		clients = new ArrayList<>();
	
	}

	@PostConstruct
	public void initService() {
		System.out.println(this.getClass().getName()+"je suis construit !"+service);
	}

	public List<Client> getClients() {
		return clients;
	}

	public void loadClients() {

		logger.info("Loading clients");

		clients.clear();

		try {

			// get all students from database
			clients = service.getClients();

		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error loading clients", exc);

			// add error message for JSF page
			addErrorMessage(exc);
		}
	}

	public String addStudent(Client cli) {

		logger.info("client ajouté : " + cli);

		try {

			// add student to the database
			service.addClient(cli);

		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error adding clients", exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		return "list-clients?faces-redirect=true";
	}

	public String loadClient(int idClient) {

		logger.info("loading client: " + idClient);

		try {
			// get student from database
			Client cli = service.getClient(idClient);

			// put in the request attribute ... so we can use it on the form
			// page
			ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();

			Map<String, Object> requestMap = externalContext.getRequestMap();
			requestMap.put("client", cli);

		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error loading id client :" + idClient, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		return "update-student-form.xhtml";
	}

	public String updateClient(Client cli) {

		logger.info("Client modifié : " + cli);

		try {

			// update client in the database
			service.updateClient(cli);

		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Error updating student: " + cli, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		return "list-client?faces-redirect=true";
	}

	public String deleteClient(int idClient) {

		logger.info("Suppression du client : " + idClient);

		try {

			// delete the student from the database
			service.deleteClient(idClient);

		} catch (Exception exc) {
			// send this to server logs
			logger.log(Level.SEVERE, "Erreur suppression client : " + idClient, exc);

			// add error message for JSF page
			addErrorMessage(exc);

			return null;
		}

		return "list-clients";
	}

	private void addErrorMessage(Exception exc) {
		FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
