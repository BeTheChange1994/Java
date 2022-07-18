import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {
		
		int i, j;
		int counter;
		
		//scanner object
		Scanner sc=new Scanner(System.in); 
		
		//take input
		System.out.print("Enter a possitive interger greater the 10 ");  
		int a= sc.nextInt();  
		
		//check if positive integer and over 10
		if(a<10) {
			System.out.print("Error number should be greater then 10");
		}else {
			
			//Loop all numbers over 10 until the number entered is hit
			for(i = 10; i<=a; i++) {
				
				//Counter for numbers divisible
				counter = 0;
				
				//Nested loop to test each number below our input
				for(j = 1; j<=a; j++) {
					
					//Test if number is divisible and add to counter if true
					if(i%j == 0) {
						counter++;
					}
					
				}
				
				//If we found only 2 numbers (i.e 1 and itself)
				if(counter == 2) {
					System.out.println(i);//print the number found
				}
				

			}
		}

	}

}
