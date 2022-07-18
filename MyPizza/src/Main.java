import java.util.InputMismatchException;
import java.util.Scanner;

/*This will be our tester class for our DeliveryControl class functionality*/

class Main{
	
	public static void main(String[] args) {
		
		//Create the DeliveryVehicleController object and initialize the arraylist
		DeliveryVehicleController k = new DeliveryVehicleController();
		Scanner input = new Scanner(System.in);//scanner object
		boolean flag = true;//variables to menu
		int value;
		
		//First menu options
		System.out.println("Please enter function to execute: ");
		System.out.println("Enter 1 to add vehicle to list");
		System.out.println("Enter 2 to remove vehicle from list");
		System.out.println("Enter 3 to print report");
		System.out.println("Enter 4 to exit");
		
		//infinite loop for menu
		while(flag) {
			
			try {
				//take user input for menu
				System.out.printf("\n");
				value = input.nextInt();
				
				if(value < 1 || value > 4) {//invalid inputs
					System.out.println("Invalid input, please try again");
				}else if(value == 4){//exit program
					System.out.println("System exit");
					flag = false;
				}else{
					
					//menu will appear again after methods are complete
					if(value == 1) {
						k.addVehicle();//add vehicle
						System.out.println("Please enter function to execute: ");
						System.out.println("Enter 1 to add vehicle to list");
						System.out.println("Enter 2 to remove vehicle from list");
						System.out.println("Enter 3 to print report");
						System.out.println("Enter 4 to exit");
					}else if(value == 2) {
						k.removeVehicle();//remove vehicle
						System.out.println("Please enter function to execute: ");
						System.out.println("Enter 1 to add vehicle to list");
						System.out.println("Enter 2 to remove vehicle from list");
						System.out.println("Enter 3 to print report");
						System.out.println("Enter 4 to exit");
					}else if(value == 3) {
						k.costPerDeliveryReport();//cost report
						System.out.println("Please enter function to execute: ");
						System.out.println("Enter 1 to add vehicle to list");
						System.out.println("Enter 2 to remove vehicle from list");
						System.out.println("Enter 3 to print report");
						System.out.println("Enter 4 to exit");
					}
					
					
				}
			}catch(InputMismatchException e) {//catch bad input and re-take input with menu
				input.next();
				System.out.println("Please enter function to execute: ");
				System.out.println("Enter 1 to add vehicle to list");
				System.out.println("Enter 2 to remove vehicle from list");
				System.out.println("Enter 3 to print report");
				System.out.println("Enter 4 to exit");
				System.out.println("Error, invalid input, please try again.");
			}
		}
		
	}
}