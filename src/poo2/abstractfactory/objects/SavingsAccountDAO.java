package poo2.abstractfactory.objects;

public class SavingsAccountDAO extends AccountDAO{
	protected static double INTERES = 20.0;
	private double interes;
	
	public SavingsAccountDAO(int a) {
		super(a);
		this.interes = INTERES;
	}

	public SavingsAccountDAO(int a, double interes) {
		super(a);
		this.interes = interes;
	}
	
	@Override
	public void deposit(double sum) {
		//System.out.println("SavingsAccount.deposit: " + this.getAccountNumber());
		if (sum > 0) {
			super.deposit(sum + (this.getBalance() * interes / 100.0));
		}
		else {
			throw new RuntimeException("SavingsAccount.deposit(...): " + "cannot deposit negative amount.");
		}
	}
	
	@Override
    public void withdraw(double sum) {
		//System.out.println("SavingsAccount.withdraw: " + this.getAccountNumber());
        if (sum > this.getBalance()) {
        	throw new RuntimeException("SavingsAccount.withdraw(...): cannot withdraw a value greater than the account balance.");
        }
        else {
        	super.withdraw(sum);
        }
    }
	
	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
}
