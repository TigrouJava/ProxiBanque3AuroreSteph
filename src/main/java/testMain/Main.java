package testMain;

import org.formation.dao.DaoClient;
import org.formation.dao.IDaoClient;
import org.formation.model.Client;
import org.formation.model.CompteCourant;

public class Main {

	public static void main(String[] args) throws Exception {
		IDaoClient dao = new DaoClient();

		Client cli = new Client("lions", "aurore");
		Client cli2 = new Client("Adelin", "Brice", "12 villa Lourcine", "75014", "Paris", "0102030405");
		Client cli3 = new Client("Woerner", "Stephanie", "1 rue marin la meslee", "94000", "creteil", "0203010508");
		Client cli4 = new Client("toto", "toto", "1 rue marin la meslee", "94000", "creteil", "0203010508");
		Client cli5 = new Client("titi", "toto");
		
		double solde = 150.0;
		String dateOuverture = "16-08-2017";
		CompteCourant c1 = new CompteCourant(solde, dateOuverture);
		cli5.setCc(c1);
		
		dao.addClient(cli);
		dao.addClient(cli2);
		dao.addClient(cli3);
		dao.addClient(cli4);
		dao.addClient(cli5);

	}

}
