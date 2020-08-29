package entities;

public class Account {
	
	private String holder;
	private int account;
	private double balance = 0;
	
	public Account() {
	}

	public Account(String holder, int account) {
		this.holder = holder;
		this.account = account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= (balance + 5);
	}
	
	public String toString() {
		return account
			+ ", Holder: "
			+ holder
			+ ", Balance: "
			+ String.format("%.2f \n\n", getBalance());
	}
}
