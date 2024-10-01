package _6_OOP;

class SavingsAccount extends BankAccount {

//Inheritance --everything that is available for BankAccount can be used in the savings Account
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);// call to the constructor from the parent class
		this.interestRate = interestRate;

	}

	public void applyInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
}
