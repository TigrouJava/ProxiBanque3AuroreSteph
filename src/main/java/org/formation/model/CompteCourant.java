package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@ManagedBean
public class CompteCourant extends Compte{

	//Attribut
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	
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
