package org.formation.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * JavaBean de la classe Client qui étend la classe abstraite Personne.
 * Comprend les attributs et constructeurs qui sont propres aux clients.
 *
 */

@Entity
@ManagedBean
@Table(name="client")
public class Client implements Serializable {

	private static final long serialVersionUID = 6616955274995509279L;

	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String codepostale;
	private String ville;
	private String tel;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name = "CompteCourant_Id", unique = true)
	private CompteCourant cc;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name = "CompteEpargne_Id", unique = true)
	private CompteEpargne ce;
	
	@ManyToOne (cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="conseiller_Id")
	private Conseiller conseiller;


	//constructeurs
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	

	public Client(String nom, String prenom, String adresse, String codepostale, String ville, String tel,
			CompteCourant cc, CompteEpargne ce) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.tel = tel;
		this.cc = cc;
		this.ce = ce;
	}

	public Client(String nom, String prenom, String adresse, String codepostale, String ville, String tel,
			CompteCourant cc) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.tel = tel;
		this.cc = cc;
	}

	public Client(String nom, String prenom, String adresse, String codepostale, String ville, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.tel = tel;
	}

	
	public Client() {
		super();
	}
	//Getters et Setters
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepostale() {
		return codepostale;
	}

	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public CompteCourant getCc() {
		return cc;
	}

	public void setCc(CompteCourant cc) {
		this.cc = cc;
	}

	public CompteEpargne getCe() {
		return ce;
	}

	public void setCe(CompteEpargne ce) {
		this.ce = ce;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
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


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", codepostale=" + codepostale
				+ ", ville=" + ville + ", tel=" + tel + ", cc=" + cc + ", ce=" + ce + ", conseiller=" + conseiller
				+ "]";
	}

	
	
	
}
