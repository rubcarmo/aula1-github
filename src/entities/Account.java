package entities;

public class Account {
	
	public int number;
	public String holder;
	public double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= (value + 5.00);
	}
	
	public String toString() {
		return "Account " + this.number
				+ " , Holder: " + this.holder
				+ " , Balance: $" + String.format("%.2f%n", this.balance);
			
	}

}
