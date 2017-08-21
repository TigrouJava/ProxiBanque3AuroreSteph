package org.formation.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * JavaBean de la classe Conseiller. Comprend
 * les attributs et constructeurs qui sont propres aux conseillersS.
 * Contient les annotations qui permettent de générer la table "conseiller" en base de données.
 *
 */
@Entity
public class Conseiller implements Serializable {

	private static final long serialVersionUID = 7317152947351197515L;
	
	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private Set<Client> clients = new HashSet<Client>();

	// constructeurs
	public Conseiller(String nom, String prenom, Set<Client> clients) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.clients = clients;
	}

	public Conseiller(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	
}
