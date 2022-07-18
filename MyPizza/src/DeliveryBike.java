//Delivery Bike class extend our superclass
public class DeliveryBike extends DeliveryVehicle {
	
	//initialize private variables
	private final double costOfRunning= 200;//annual maintenance 
	private final double grant = -250;
	private double costToRun;//calculate cost to run from (service time * cost) - (service time * grant)
	private int totalDeliveries;//will be used to calculate cost per delivery
	
	//constructor
	public DeliveryBike(int totalSer, int totalDis, int totalDel, int id) {
		
		super(totalSer, totalDis, totalDel, id);//call to super class
		
		setCostToRun(totalSer);//call to set cost method
		totalDeliveries = totalDel;//instantiate variables
		
	}
	
	
	//calculate cost to run
	public void setCostToRun(int totalSer) {
		
		costToRun = (costOfRunning * totalSer) - (grant * totalSer);
		
	}
	
	public double getCostToRun() {
		return costToRun;
	}
	
	//calculate cost per delivery
	public double costPerDelivery() {
		return getCostToRun() / totalDeliveries;
	}
	
	//toString method, overrides superclass
	@Override
	public String toString() {
		return String.format("Vehicle Type: Delivery Bike\nCost to Run: %.2f\nCost Per Delivery: %.2f%s", 
				getCostToRun(), costPerDelivery(), super.toString());
	}

}
