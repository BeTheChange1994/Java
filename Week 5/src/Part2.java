import java.util.*;

public class Part2 {

	public static void main(String[] args) {
		
		//initialize variables
		int i= 0;
		int input;
		
		//create set (will not take two elements the same value)
		Set<Integer> set = new HashSet<Integer>();
		Scanner in = new Scanner(System.in);//scanner object 
		
		//loop through set list
		while(i<5) {
			
			System.out.println("Enter an int between 10 and 100");
			
			//try for exception
			try {
				
				input = in.nextInt();//take input
			
				//check for out of range
				if(input >= 10 && input <= 100) {
					
					//loop through set
					for(int number : set) {
						if(number == input) {//if input is a repeat
							System.out.printf("You have already entered this integer: " + input + "%n");
							i--;
						}	
					}
					
					set.add(input);//add to set
					i++;//increment set
					
				}
				else {
					System.out.println("Number out of range, please try again.");//catch out of range
				}
			}
			catch(NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again.");//catch invalid input
				in.nextLine();//continue input
			}
		}
		
		System.out.printf("%n");//new line
		
		System.out.println("The full set is: " + set);//print set
	
		//close scanner
		in.close();
		System.exit(0);
	}
}
