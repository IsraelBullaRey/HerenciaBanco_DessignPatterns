package poo2.abstractfactory.objects;

public class AccountDAO {
	private double bal; // The current balance
	private int accnum; // The account number

	public AccountDAO(int a) {
		bal = 0.0;
		accnum = a;
		System.out.println("Cuenta creada con el número: " + this.accnum);
	}
	
	public void deposit(double sum) {
		if (sum > 0)
			bal += sum;
		else
			System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
	}

	public void withdraw(double sum) {
		if (sum > 0)
			bal -= sum;
		else
			System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
	}

	public double getBalance() {
		return bal;
	}
	
	//Método para el punto 4.
	public final void setBalance(double bal) {
		this.bal = bal;
	}

	public int getAccountNumber() {
		return accnum;
	}

	public String toString() {
		return "Acc " + accnum + ": " + "balance = " + bal;
	}

	public final void print() {
		// Don't override this,
		// override the toString method
		System.out.println(toString());
	}
}
