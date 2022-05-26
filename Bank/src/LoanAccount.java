//Week 3 part 2 LoanAccount inherits from BankAccount

public class LoanAccount extends BankAccount {
	
	//Instance variables
	private double overdraftLimit;
	public static final double interestRate = 0.1;//the interest rate is static and final
	
	//Constructor calls on BankAccount's constructor and sets overdraftLimit to 0
	public LoanAccount(String name, int accountNumber) {
		
		super(name, accountNumber);
		
		overdraftLimit = 0;
	}
	
	@Override//New withdrawal method set to catch withdrawal past the overdraft limit
	public void withdraw(double withdrawalAmount) {
		
		if(super.getBalance() + withdrawalAmount >= overdraftLimit) {
			super.setBalance(withdrawalAmount);
		}
	}
	
	//set over over draft method
	public void setOverdraftLimit(double overdraftLimit) {
		
		this.overdraftLimit = overdraftLimit;
	}

	//get over draft limit
	public double getOverDraftLimit() {
		return overdraftLimit;
	}
	
	//calculate the interest, catch no interest instances
	public String calInterest() {
		
		double balance = super.getBalance();
		
		if(balance >= 0) {
			throw new IllegalArgumentException("No interest, account is not in overdraft, interest is 0");
		}
		
		return String.format("The interest for this account is: %.2f", (balance * interestRate));
		
	}
}
