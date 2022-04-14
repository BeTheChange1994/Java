//Creating and manipulating an Account Object.
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		//print initial balance
		System.out.printf("%s balance: €%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: €%.2f%n", account2.getName(), account2.getBalance());		
		
		//create a Scanner object to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		//Take deposit amount and adding it to account1 balance
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to  account1's balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		//Display balances
		System.out.printf("%s balance: €%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: €%.2f%n", account2.getName(), account2.getBalance());
		
		//Take deposit amount and adding it to account2 balance
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to  account1's balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		//Display balances
		System.out.printf("%s balance: €%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: €%.2f%n", account2.getName(), account2.getBalance());
		
		/*
		//Create an account object and assigning it to  myAccount
		Account myAccount = new Account("Aron moran");
		
		//Display  initial value of name (null)
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		//Prompt for and read name 
		System.out.println("Please enter the name:");
		String theName = input.nextLine();//read a line of text
		myAccount.setName(theName);//put theName in myAccount 
		System.out.println();//outputs a blank line
		
		//Display the name stored in object myAccount
		System.out.printf("Name  in object myAccount is:%n%s%n",
				myAccount.getName());
		*/
	}

}
