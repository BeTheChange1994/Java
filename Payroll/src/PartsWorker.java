//Week 4 Assignment

public class PartsWorker extends Employee {
	
	//Initialize 
	private double payPerPiece;
	private int numberProduced;
	private final int bonus = 100;
	private final int bonusTarget = 50;

	//Constructor
	public PartsWorker(String first, String last, String ssn, double payPerPiece, int numberProduced) {
		
		super(first, last, ssn);//Call to SuperClass
		
		setPayPerPiece(payPerPiece);
		setNumberProduced(numberProduced);
		
	}
	
	//set and get pay per piece and check value is in range
	public void setPayPerPiece(double PPP){
		payPerPiece = PPP < 0.0 ? 0.0 : PPP;
	}
	
	public double getPayPerPriece() {
		return payPerPiece;
	}
	
	//set and get number produced and check value is in range
	public void setNumberProduced(int NP) {
		numberProduced = NP < 0 ? 0 : NP;
	}
	
	public int getNumberProduced() {
		return numberProduced;
	}
	
	//Implementation of earnings
	public double earnings() {
		
		if(numberProduced > bonusTarget) {
			return (payPerPiece * numberProduced) + bonus;
		}else {
			return payPerPiece * numberProduced;
		}
	}
	
	//toString format
	public String toString() {
	      return String.format( "PartsWorker employee: %s\n%s: €%,.2f\n%s: %d", super.toString(), "Pay per part", getPayPerPriece(),
	    		  "Number of part made", getNumberProduced());
	}
}
