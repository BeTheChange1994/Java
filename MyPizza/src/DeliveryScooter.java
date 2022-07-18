//Delivery Scooter class extend our superclass
public class DeliveryScooter extends DeliveryVehicle {
	
	//initialize private variables (variables here work much the same as Car class)
	private final double costOfRunning = 2000;//annual maintenance 
	private double costToRun;
	private double fuelCost;
	private int totalDeliveries;
	
	//constructor
	public DeliveryScooter(int totalSer, int totalDis, int totalDel, int id, double fuelPerD) {
		
		super(totalSer, totalDis, totalDel, id);
		
		totalDeliveries = totalDel;
		setCostToRun(totalSer);
		setFuelCost(fuelPerD, totalDis);
		
	}
	
	//calculate cost to run
	public void setCostToRun(int totalSer) {
		
		costToRun = costOfRunning * totalSer;
		
	}
	
	public double getCostToRun() {
		return costToRun;
	}
	
	//calculate fuel costs
	public void setFuelCost(double fuelPerD, int totalDis) {
		
		fuelCost = fuelPerD * totalDis;
		
	}
	
	public double getFuelCost() {
		return fuelCost;
	}
	
	//calculate cost per delivery
	public double costPerDelivery() {
		return (getCostToRun() + getFuelCost()) / totalDeliveries;
	}
	
	//toString method
	@Override
	public String toString() {
		return String.format("Vehicle Type: Delivery Scooter\nCost to Run: %.2f\nFuel Costs: %.2f\nCost Per Delivery: %.2f%s", 
				getCostToRun(), getFuelCost(), costPerDelivery(), super.toString());
	}

}
