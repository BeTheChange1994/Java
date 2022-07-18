import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//Controller class
public class DeliveryVehicleController {

	//create objects for arraylist and scanner
	private static ArrayList<DeliveryVehicle> vehicles;
	public static Scanner newVehicle = new Scanner(System.in);
	
	//constructor
	public DeliveryVehicleController(){
		vehicles = new ArrayList<DeliveryVehicle>();//array list is created
	}
	
	//add vehicle method
	public void addVehicle() {
		
		//initialize variables
		boolean flag = true;//second menu variable
		int vehicleName;
		int totalService;
		int totalDistance;
		int totalDeliveries;
		double fuelPerMile;
		int idNumber;
		
		//print menu
		System.out.println("Please enter the vehicle you wish to add: ");
		System.out.println("Enter 1 for Bike");
		System.out.println("Enter 2 for Car");
		System.out.println("Enter 3 for Scooter");
		System.out.println("Enter 4 to exit");
		
		//infinite loop for second menu
		while(flag) {
			
			try {
				//take user input
				System.out.printf("\n");
				vehicleName = newVehicle.nextInt();
				
				if(vehicleName < 1 || vehicleName > 4) {//catch invalid input
					System.out.println("Invalid input, please try again");
				}else if(vehicleName == 4){//exit menu
					System.out.println("System exit");
					flag = false;
				}else{
					//take parameter inputs
					System.out.println("Pleae enter service time (in years): ");
					totalService = newVehicle.nextInt();
					
					System.out.println("Pleae enter distance (to closest mile): ");
					totalDistance = newVehicle.nextInt();
					
					System.out.println("Pleae enter total deliveries: ");
					totalDeliveries = newVehicle.nextInt();
					
					System.out.println("Pleae enter fuel cost per mile (if none enter 0): ");
					System.out.print("€");
					fuelPerMile = newVehicle.nextDouble();
					
					System.out.println("Pleae enter vehicle ID: ");
					idNumber = newVehicle.nextInt();
					
					//catch witch class to create object for and give parameters
					if(vehicleName == 1) {
						DeliveryBike buffer = new DeliveryBike(totalService, totalDistance, totalDeliveries, idNumber);//buffer is created before object is added to arraylist
						vehicles.add(buffer);//add object to arraylist
						printVehicleDetails(buffer);//print the object to console
					}else if(vehicleName == 2) {
						DeliveryCar buffer = new DeliveryCar(totalService, totalDistance, totalDeliveries, idNumber, fuelPerMile);
						vehicles.add(buffer);
						printVehicleDetails(buffer);
					}else if(vehicleName == 3) {
						DeliveryScooter buffer = new DeliveryScooter(totalService, totalDistance, totalDeliveries, idNumber, fuelPerMile);
						vehicles.add(buffer);
						printVehicleDetails(buffer);
					}
					
					flag = false;//end add method
					
				}
			
				
			}catch(InputMismatchException e) {//catch invalid inputs
				newVehicle.next();
				System.out.println("Please enter the vehicle you wish to add: ");
				System.out.println("Enter 1 for Bike");
				System.out.println("Enter 2 for Car");
				System.out.println("Enter 3 for Scooter");
				System.out.println("Enter 4 to exit");
				System.out.println("Error, invalid input, please start again.");
			}
		}

		
	}
	
	//print vehicle object method (take object as parameter)
	private static void printVehicleDetails(DeliveryVehicle e){
		
		System.out.printf(e.toString());
		
	}
	
	//remove arraylist object method
	public void removeVehicle() {
		
		int remove;//this will be out index location
		
		System.out.println("Please enter vehicle ID Number: ");
		remove = getIndex(newVehicle.nextInt());//uses getIndex method to find index of object
		
		vehicles.remove(remove);//remove object
		
		System.out.printf("The vehicle was removed at index value: %d", remove);//print when object is removed with the index value it was at
		
	}
	
	//get index in arraylist method
	private int getIndex(int idNumber) {
		
		for(int i = 0; i < vehicles.size(); i++) {//loop through arraylist until id is found
			if(vehicles.get(i).getId() == idNumber) {
				return vehicles.indexOf(vehicles.get(i));
			}else {
				return -1;//if not found return -1
			}
		}
		return 0;//return successfully
		
	}
	
	//print cost report method
	public void costPerDeliveryReport() {
		
		//report header
		System.out.printf("\n");
		System.out.println("Cost Per Delivery Report");
		System.out.println("-------------------------");
		
		//loop through array and print each object
		for(int i = 0; i < vehicles.size(); i++) {
			
			System.out.printf("\nVehichle Id: %d", vehicles.get(i).getId());
			System.out.printf("\nDelivery cost: %.2f", vehicles.get(i).costPerDelivery());
			System.out.println("\n-------------------------\n");
			
		}
		
	}
	

	
}
