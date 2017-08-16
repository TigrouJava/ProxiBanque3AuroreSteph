package org.formation.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Conseiller extends Personne {

	// Attributs
	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private Set<Client> clients = new HashSet<Client>();

	// constructeurs
	public Conseiller(long id, String nom, String prenom, Set<Client> clients) {
		super(id, nom, prenom);
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
	}

	public Conseiller() {
		super();
	}

	
	// Getters et Setters
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Set<Client> getClients() {
		return clients;
	}

}
