package org.formation.model;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 
 * Classe abstraite Personne permettant de factoriser des attributs communs aux clients et conseillers.
 *
 */

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne {

	//Attributs
	/**
	 * Annotation permettant de générer automatiquement l'identifiant (Id des coneillers et clients).
	 *
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nom;
	private String prenom;
	
	//constructeurs
	public Personne(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne() {
		super();
	}

	//Getters et Setters
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

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
