package org.formation.dao;


import org.formation.model.CompteCourant;
import org.formation.model.CompteEpargne;


public interface IDaoCompte {

	/**
	 * D�claration des m�thodes CRUD pour les comptes courants (Cr�ation, Modification, D�l�tion, R�cup�ration).
	 *
	 */
	

	void ajouterCompteC(CompteCourant cc) throws Exception;

	CompteCourant getCompteC(long idCompteC) throws Exception;

	void modifierCompteC(CompteCourant cc) throws Exception;

	void suppressionCompteC(long idCompteC) throws Exception;

	
	/**
	 * D�claration des m�thodes CRUD pour les comptes �pargnes (Cr�ation, Modification, D�l�tion, R�cup�ration).
	 *
	 */

	void ajouterCompteE(CompteEpargne ce) throws Exception;

	CompteEpargne getCompteE(long idCompteE) throws Exception;

	void modifierCompteE(CompteEpargne ce) throws Exception;

	void suppressionCompteE(long idCompteE) throws Exception;
}
