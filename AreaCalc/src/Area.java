import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double width, height;
		int userChoice;

		System.out.print("Please enter shape choice (1 = rectangle / 2 = triangle): ");
		userChoice = input.nextInt();
		
		if(userChoice == 1) {
			
			System.out.print("Please enter rectangle height: ");
			height = input.nextInt();
			
			System.out.print("Please enter rectangle width: ");
			width = input.nextInt();
			
			System.out.print("Your area is: " + width*height);
			
		}else if(userChoice == 2) {
			
			System.out.print("Please enter triangle height: ");
			height = input.nextInt();
			
			System.out.print("Please enter triangle width: ");
			width = input.nextInt();
			
			System.out.print("Your area is: " + (width/2)*height);
			
		}else {
			System.out.print("Error, incorrect input");
		}
		
		
	}
}
