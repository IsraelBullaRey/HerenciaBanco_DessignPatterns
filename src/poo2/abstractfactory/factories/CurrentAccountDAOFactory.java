package poo2.abstractfactory.factories;

import poo2.abstractfactory.objects.AccountDAO;

public class CurrentAccountDAOFactory implements AccountDAOFactory{

	private static volatile CurrentAccountDAOFactory instance;
	
	@Override
	public AccountDAO abrirCuenta(int accnum) {

		AccountDAO acc = new AccountDAO(accnum);
		return acc;
		
	}
	
	public static CurrentAccountDAOFactory getInstance() {
		CurrentAccountDAOFactory result = instance;
		
		if (result != null) {
			return result;
		}
		// ...
		synchronized (CurrentAccountDAOFactory.class) {
			// ...
			if (instance == null) {
				instance = new CurrentAccountDAOFactory();
			}
			return instance;
		}
	}
}
