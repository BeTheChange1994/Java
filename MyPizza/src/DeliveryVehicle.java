//superclass
public abstract class DeliveryVehicle {
	
	//initialize private variables
	private int totalService;
	private int totalDistance;
	private int totalDeliveries;
	private int idNumber;
	
	//constructor
	public DeliveryVehicle(int totalSer, int totalDis, int totalDel, int id) {
		
		//catch negative inputs
		if(totalSer < 0) {
			throw new IllegalArgumentException("Total service time must be >= 0");
		}
		
		if(totalDis < 0) {
			throw new IllegalArgumentException("Total distance run must be >= 0");
		}
		
		if(totalDel < 0) {
			throw new IllegalArgumentException("Total deliveries must be >= 0");
		}
		
		//instantiate variables
		totalService = totalSer;
		totalDistance = totalDis;
		totalDeliveries = totalDel;
		idNumber = id;
	}
	
	
	//Setter and getter methods (also catch negative inputs)
	public void setService(int totalSer) {
		
		if(totalSer < 0) {
			throw new IllegalArgumentException("Total service time must be >= 0");
		}
		
		totalSer = totalService;
	}
	
	public int getService() {
		return totalService;
	}
	
	public void setDistance(int totalDis) {
		
		if(totalDis < 0) {
			throw new IllegalArgumentException("Total distance run must be >= 0");
		}
		
		totalDis = totalDistance;
	}
	
	public int getDistance() {
		return totalDistance;
	}
	
	public void setDeliveries(int totalDel) {
		
		if(totalDel < 0) {
			throw new IllegalArgumentException("Total deliveries must be >= 0");
		}
		
		totalDel = totalDistance;
	}
	
	public int getDeliveries() {
		return totalDeliveries;
	}
	
	public void setId(int id) {
		id = idNumber;
	}
	
	public int getId() {
		return idNumber;
	}
	
	//abstract method
	public abstract double costPerDelivery();
	
	//toString method
	public String toString() {
		return String.format("\nTotal Time in Service: %d\nTotal Distance: %d\nTotal Deliveries: %d\nVehicle ID: %d\n",
				getService(), getDistance(), getDeliveries(), getId());
	}

}
