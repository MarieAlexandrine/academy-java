package _6_OOP;

public class BankSystem {
	public static void main(String[] args) {
//		BankAccount myAccount = new BankAccount("98767", 1200.00);// creating the object
//		myAccount.displayAccountInfo();
//		BankAccount newMyAccount = new BankAccount("123456", 1200.02);
//		newMyAccount.displayAccountInfo();
//		
		SavingsAccount myAccount = new SavingsAccount ("12345", 500, 2);
		myAccount.applyInterest();
		
ChequingAccount myAccount1 = new ChequingAccount ("12345", 500,200);
myAccount1.withdraw(300);
myAccount1.displayAccountInfo();

	}
}
