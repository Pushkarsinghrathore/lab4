package LAb2;


public class Persondemo {
	public static void main(String[] args) {
	Account Smith = new Account(2000);  
	Account Kathy = new Account(8000);
    Smith.deposit(2000);
    Kathy.deposit(8000);
    System.out.println(Smith.getBalance());
    System.out.println(Kathy.getBalance());
    Smith.withdraw(600);
    Kathy.withdraw(800);
    System.out.println(Smith.getBalance());
    System.out.println(Kathy.getBalance());
	}


}
