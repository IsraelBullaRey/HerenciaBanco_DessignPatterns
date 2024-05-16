package poo2.abstractfactory.client;

import poo2.abstractfactory.factories.AccountDAOFactory;
import poo2.abstractfactory.factories.CurrentAccountDAOFactory;
import poo2.abstractfactory.factories.SavingsAccountDAOFactory;
import poo2.abstractfactory.objects.AccountDAO;

public class AppClient {

	public static void main(String[] args) {
		
		AppClient app = new AppClient();
		
		AccountDAOFactory factory = app.configureApplication('A');
		AccountDAO acc1 = factory.abrirCuenta(11231);
		AccountDAO acc2 = factory.abrirCuenta(12131);
		
		AccountDAOFactory factory2 = app.configureApplication('C');
		AccountDAO acc3 = factory.abrirCuenta(12313);
		AccountDAO acc4 = factory.abrirCuenta(34551);
		
		AccountDAOFactory factory3 = app.configureApplication('E');
		AccountDAO acc5 = factory.abrirCuenta(12331);
		AccountDAO acc6 = factory.abrirCuenta(24553);
		
	}
	
	private AccountDAOFactory configureApplication(char parametro) {
		
		AccountDAOFactory factory = null;
		
		if(parametro != 'A' && parametro != 'C') {
			throw new RuntimeException("No es posible crear cuentas inexistentes");
		}
		if(parametro=='A')
			factory = SavingsAccountDAOFactory.getInstance();
		else
			factory = CurrentAccountDAOFactory.getInstance();
		
		return factory;
		
	}
}
