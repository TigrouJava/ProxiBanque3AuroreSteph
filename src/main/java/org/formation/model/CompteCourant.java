package org.formation.model;

import javax.persistence.OneToOne;

public class CompteCourant extends Compte{

	//Attribut
	@OneToOne(mappedBy="cc")
	Client client;

	
	//Constructeur
	public CompteCourant(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}
	
	public CompteCourant() {
		super();
	}

	
	//Getter
	public Client getClient() {
		return client;
	}
	
}
