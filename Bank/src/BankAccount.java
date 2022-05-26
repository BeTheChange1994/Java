//Week 3 Part 1

public class BankAccount {
	
	//Instance variables
	private String name;
	private int accountNumber;
	private double balance;
	
	//Constructor
	public BankAccount(String name, int accountNumber) {
		
		this.name = name;
		this.accountNumber = accountNumber;
		balance = 0;//set balance to 0
	}
		
	//Deposit where deposit must be over 0.0 
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}else {
			throw new IllegalArgumentException("Error, deposit amount cannot be < 0.0");
		}
	}
	
	//Withdrawal with catch for withdrawals past 0.0
	public void withdraw(double withdrawalAmount) {
		if(balance >= withdrawalAmount) {
			balance = balance - withdrawalAmount;
		}else {
			throw new IllegalArgumentException("Error, withdrawal ammount cannot be > balance. No overdrafts.");
		}
	}
	
	//Protected setBalance that doesnt check balance 
	protected void setBalance(double modifier) {
		balance = balance + modifier;
	}
	
	//Get name method
	public String getName() {
		return name;
	}
	
	//Get Account Number method
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//Get balance Method
	public double getBalance() {
		return balance;
	}

	//Return String with name and balance
	public String toString() {
		return String.format("%s: Balance - %.2f", getName(), getBalance());
	}
}
