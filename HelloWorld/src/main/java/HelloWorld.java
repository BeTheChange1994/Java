import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		//System.out.print("The computer says: ");
		//System.out.println("Hello World!");
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first interger: ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second interger: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
		
	
	}
}
