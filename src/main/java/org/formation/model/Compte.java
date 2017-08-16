package org.formation.model;


public abstract class Compte {

	// Attributs	
	private double solde;
	private String dateOuverture;

	// Constructeurs
	public Compte(double solde, String dateOuverture) {
		super();
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	public Compte() {
		super();
	}

	// Getters et Setters
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public long getNumCompte() {
		return getNumCompte();
	}

	// To String
//	@Override
//	public String toString() {
//		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
//	}

}
