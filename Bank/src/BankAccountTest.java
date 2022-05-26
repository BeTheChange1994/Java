//Testing program for week 3 part 1

public class BankAccountTest {

	public static void main(String[] args) {
		
		//Create Account Objects
		BankAccount account1 = new BankAccount("Ronan Burke", 001);
		BankAccount account2 = new BankAccount("Sarah Clarke", 002);
		
		//print start balance
		System.out.printf("Account 1 starting balance: €%.2f", account1.getBalance());
		System.out.printf("%nAccount 2 starting balance: €%.2f", account2.getBalance());
		
		account1.deposit(500);//deposit 500 in account 1
		
		account2.deposit(7500);//deposit 7500 in account 2
		
		//print balance after deposit
		System.out.printf("%nAccount 1 after deposit balance: €%.2f", account1.getBalance());
		System.out.printf("%nAccount 2 after deposit balance: €%.2f", account2.getBalance());
		
		//Test to catch withdraw past limit of 0.0
		//account2.withdraw(8000);
		
		account2.withdraw(500);//withdraw 500
		
		//print after withdrawal
		System.out.printf("%nAccount 2 after €500 withdrawal €%.2f", account2.getBalance());

	}

}
