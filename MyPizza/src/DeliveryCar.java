//Delivery Car class extend our superclass
public class DeliveryCar extends DeliveryVehicle {
	
	//initialize private variables
	private final double costOfRunning = 1000;//annual maintenance 
	private double costToRun;
	private double fuelCost;//will be used to calculate cost per delivery late
	private int totalDeliveries;
	
	//constructor
	public DeliveryCar(int totalSer, int totalDis, int totalDel, int id, double fuelPerD) {
		
		super(totalSer, totalDis, totalDel, id);
		
		totalDeliveries = totalDel;
		setCostToRun(totalSer);//to calculate price to run by costOfRunning * service time
		setFuelCost(fuelPerD, totalDis);//calculate fuel fuel per mile * distance
		
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
	
	//cost per delivery is fuel costs + cost to run
	public double costPerDelivery() {
		return (getCostToRun() + getFuelCost()) / totalDeliveries;
	}
	
	//toString method, overrides superclass
	@Override
	public String toString() {
		return String.format("Vehicle Type: Delivery Car\nCost to Run: %.2f\nFuel Costs: %.2f\nCost Per Delivery: %.2f%s", 
				getCostToRun(), getFuelCost(), costPerDelivery(), super.toString());
	}

}
