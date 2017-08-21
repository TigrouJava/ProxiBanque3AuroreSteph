package org.formation.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * JavaBean de la classe CompteEpargne qui �tend la classe abstraite Compte. Comprend
 * les attributs et constructeurs qui sont propres aux comptes epargnes.
 * Contient les annotations qui permettent de g�n�rer la table "compteEpargne" en base de donn�es.
 *
 */

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
