package _6_OOP;

 class ChequingAccount extends BankAccount{
private double overDraftLimit;
	public ChequingAccount(String accountNumber, double initialBalance, double overDraftLimit) {
		super(accountNumber, initialBalance);
		this.overDraftLimit= overDraftLimit;
	}
public void withdraw(double amount) {
	if (amount>0 && amount <= (getBalance () + overDraftLimit)) {
		super.withdraw(amount);
	}
}
}
