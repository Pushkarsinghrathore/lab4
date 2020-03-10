package LAb2;

public class Savingsaccount extends Account {
	Savingsaccount(long accnum) {
		super(accnum);
	}

	final int min_bal = 500;

	public void withdraw(double amount) {
		if (super.getBalance() == min_bal && (super.getBalance() - amount) >= min_bal) {
			super.setBalance(super.getBalance() - amount);
			System.out.println("Balance:"+super.getBalance());
		}
		else {
			System.out.println("Not Sufficient Balance");
		}

	}
}
