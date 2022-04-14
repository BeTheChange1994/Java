
public class Account {
	
	//instance variables
	private String name;
	private double balance;
	
	
	//Account constructor 
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//method to add a deposit to balance
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	
	//method returns balance
	public double getBalance() {
		return balance;
	}
	
	//sets name
	public void setName(String name) {
		this.name = name;
		
	}
	
	//gets name
	public String getName() {
		return name;
	}

}
