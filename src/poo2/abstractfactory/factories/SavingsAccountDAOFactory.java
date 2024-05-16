package poo2.abstractfactory.factories;

import poo2.abstractfactory.objects.AccountDAO;

public class SavingsAccountDAOFactory implements AccountDAOFactory {
	
	private static volatile SavingsAccountDAOFactory instance;
	
	@Override
	public AccountDAO abrirCuenta(int accnum) {
		
		AccountDAO acc = new AccountDAO(accnum);
		return acc;
		
	}
	
	public static SavingsAccountDAOFactory getInstance() {
		SavingsAccountDAOFactory result = instance;
		
		if (result != null) {
			return result;
		}
		// ...
		synchronized (SavingsAccountDAOFactory.class) {
			// ...
			if (instance == null) {
				instance = new SavingsAccountDAOFactory();
			}
			return instance;
		}
	}
}
