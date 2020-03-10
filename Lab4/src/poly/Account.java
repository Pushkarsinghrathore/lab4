package poly;

public abstract class Account {
	private long accnum;
	private double balance;
	private Person accholder;

	Account(long accnum) {
		accnum++;
	}

	public long getAccnum() {
		return accnum;
	}

	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccholder() {
		return accholder;
	}

	public void setAccholder(Person accholder) {
		this.accholder = accholder;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public abstract boolean withdraw(double amount);

	@Override
	public String toString() {
		return "Account [accnum=" + accnum + ", balance=" + balance + ", accholder=" + accholder + "]";
	}

}
