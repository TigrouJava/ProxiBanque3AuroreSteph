package testMain;

import org.formation.dao.DaoClient;
import org.formation.dao.IDaoClient;
import org.formation.model.Client;

public class Main {

	public static void main(String[] args) throws Exception {
		IDaoClient dao = new DaoClient();
		
		Client cli = new Client("Lions", "Aurore");
		dao.addClient(cli);

	}

}
