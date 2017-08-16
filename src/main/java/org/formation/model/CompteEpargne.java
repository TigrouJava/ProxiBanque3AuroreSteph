package org.formation.model;

import javax.persistence.OneToOne;

public class CompteEpargne extends Compte {

	//Attribut
	@OneToOne(mappedBy="ce")
	Client client;

	
	//Constructeurs
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(double solde, String dateOuverture) {
		super(solde, dateOuverture);
	}

	//Getter
	public Client getClient() {
		return client;
	}
	
}
