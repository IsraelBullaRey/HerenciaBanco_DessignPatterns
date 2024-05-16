package poo2.abstractfactory.factories;

import poo2.abstractfactory.objects.AccountDAO;

public interface AccountDAOFactory {
	
	public AccountDAO abrirCuenta(int accnum);
	
}
