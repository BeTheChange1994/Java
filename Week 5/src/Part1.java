import java.util.NoSuchElementException;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		
		//initialize variables, arrays and Objects
		int a[] = new int[5];
		int i = 0;
		int j = 0;
		int input;
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		
		//Loop through array
		while(i<5) {
			System.out.println("Enter an int between 10 and 100");
			
			//try for exception
			try {
				input = in.nextInt();//take input from user

				//Check input is in range
				if(input >= 10 && input <= 100) {
					
					//loop through array elements
					for(int number : a) {
						flag = false;
						if(number == input) {//check for repeated inputs
							flag = true;
							System.out.println("You have already entered this integer: " + input);
							break;
						}
					}
					if(flag == false) {//add to array if no repeat was found
							a[i] = input;
							i++;
					}
				}
				else {//catch out of range numbers
					System.out.println("Number out of range, please try again.");
				}
			}
			catch(NoSuchElementException elementException) {//catch invalid inputs and continue program
				System.err.println("Invalid input. Please try again.");
				in.nextLine();
			}
		}
		
		System.out.printf("%n");//print next line
		
		//print array after input has been taken
		for(int number : a) {
			j++;
			System.out.printf("Array position %d is: %d%n", j, number);
		}
		
		//close out scanner
		in.close();
		System.exit(0);
	}
}
