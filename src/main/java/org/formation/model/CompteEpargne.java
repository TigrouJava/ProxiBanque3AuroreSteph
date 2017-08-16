package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@ManagedBean
public class CompteEpargne extends Compte {

	//Attribut
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
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
