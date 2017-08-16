package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * JavaBean de la classe Client qui étend la classe abstraite Personne.
 * Comprend les attributs et constructeurs qui sont propres aux clients.
 *
 */

@Entity
@ManagedBean
public class Client extends Personne {

	//Attributs
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
	public Client(long id, String nom, String prenom, String adresse, String codepostale, String ville, String tel,
			CompteCourant cc, CompteEpargne ce, Conseiller conseiller) {
		super(id, nom, prenom);
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.tel = tel;
		this.cc = cc;
		this.ce = ce;
		this.conseiller = conseiller;
	}
	
	public Client(long id, String nom, String prenom, String adresse, String codepostale, String ville, String tel,
			CompteCourant cc, CompteEpargne ce) {
		super(id, nom, prenom);
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.tel = tel;
		this.cc = cc;
		this.ce = ce;
	}
	
	public Client(String nom, String prenom) {
		super(nom, prenom);
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

	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", codepostale=" + codepostale + ", ville=" + ville + ", tel=" + tel
				+ ", cc=" + cc + ", ce=" + ce + ", conseiller=" + conseiller + "]";
	}
	
	
}
