//Week 3 part 2 tester

public class LoanAccountTest {

	public static void main(String[] args) {
		
		//Create 2 LoanAccount Objects
		LoanAccount account1 = new LoanAccount("Michael Doyle", 001);
		LoanAccount account2 = new LoanAccount("John McGuire", 002);
		
		System.out.print("Initial balance and over draft of accounts:\n");
		
		System.out.printf("\nAcount 1 \nname: %s \nAccount Number: %d \nBalance: %.2f \nOverdraft Limit: %.2f\n\n", 
				account1.getName(), account1.getAccountNumber(), account1.getBalance(), account1.getOverDraftLimit());
		
		System.out.printf("\nAcount 2 \nname: %s \nAccount Number: %d \nBalance: %.2f \nOverdraft Limit: %.2f\n\n", 
				account2.getName(), account2.getAccountNumber(), account2.getBalance(), account2.getOverDraftLimit());

		//Add overdraft
		account1.setOverdraftLimit(-2500);
		account2.setOverdraftLimit(-650);
		
		System.out.printf("\n\nAccount 1 overdraft €%.2f", account1.getOverDraftLimit());
		System.out.printf("\nAccount 2 overdraft €%.2f", account2.getOverDraftLimit());
		
		//Add to balance
		account1.setBalance(750);
		account2.setBalance(50);
		
		System.out.printf("\n\nAccount 1 after adding balance €%.2f", account1.getBalance());
		System.out.printf("\nAccount 2 after adding balance €%.2f", account2.getBalance());
		
		//Withdraw into overdraft
		account1.withdraw(-800);
		account2.withdraw(-800);//Will not execute as is over the overdraft limit
		
		System.out.printf("\n\nAccount 1 after withdrawing 800 from balance €%.2f", account1.getBalance());
		System.out.printf("\nAccount 2 after withdrawing 800 from balance €%.2f", account2.getBalance());
		
		//Interest rates
		System.out.printf("\n\nAccount 1 interest rate: %s\n", account1.calInterest());
		System.out.printf("Account 2 interest rate: %s", account2.calInterest());
		
		
	}

}
