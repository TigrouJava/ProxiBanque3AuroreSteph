package org.formation.dao;


import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;


public interface IDaoCompte {

	/**
	 * Déclaration des méthodes CRUD pour les comptes courants (Création, Modification, Délétion, Récupération).
	 *
	 */
	

	void ajouterCompteC(CompteCourant cc) throws Exception;

	CompteCourant getCompteC(long idCompteC) throws Exception;

	void modifierCompteC(CompteCourant cc) throws Exception;

	void suppressionCompteC(long idCompteC) throws Exception;

	
	/**
	 * Déclaration des méthodes CRUD pour les comptes épargnes (Création, Modification, Délétion, Récupération).
	 *
	 */

	void ajouterCompteE(CompteEpargne ce) throws Exception;

	CompteEpargne getCompteE(long idCompteE) throws Exception;

	void modifierCompteE(CompteEpargne ce) throws Exception;

	void suppressionCompteE(long idCompteE) throws Exception;
}
