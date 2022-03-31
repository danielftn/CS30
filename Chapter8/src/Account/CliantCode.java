package Account;

import java.util.Scanner;

import Account.Customer;

public class CliantCode {
	
	public static Account createcustomer()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fName = input.next();
		
		System.out.println("Enter last name: ");
		String lName = input.next();
		
		System.out.println("What is your address: ");
		String add = input.nextLine();
		 
		input.nextLine();
		
		System.out.println("Which city do you live in: ");
		String cy = input.next();
		
		System.out.println("Which province do you live in: ");
		String pvince = input.next();
		
		System.out.println("How much do you have in your account: ");
		int balance = input.nextInt();
		
		System.out.println("How much do you want to deposit: ");
		int deposit = input.nextInt();
		
		
		System.out.println("Would you like to open your Business or Personal account(B or P): ");
		String position = input.next();
		if (position.equalsIgnoreCase("P"))
		{
			System.out.println("How much do you want to withdraw: ");
			int withdraw = input.nextInt();
			return (new Account(fName, lName, balance, deposit,withdraw));
		}
		
		else 
			System.out.println("How much do you want to withdraw: ");
			int withdraw = input.nextInt();
			return (new Account(fName, lName, balance, deposit,withdraw));
	}
	
	public static void main (String[] args)
	{
		Account eX1;
		
		eX1 = createcustomer();
		System.out.print(eX1);

		
	}
}
