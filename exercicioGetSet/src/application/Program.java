package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account ac;
		double balance;
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		
		ac = new Account(holder, account);
		
		System.out.println("Is there a initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y'){
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
			ac.deposit(balance);
		}
		
		System.out.printf("Account: " + ac.toString());
		
		System.out.println("Enter a deposit value: ");
		balance = sc.nextDouble();
		ac.deposit(balance);
		
		System.out.println("Updated account: ");
		System.out.printf("Account: " + ac.toString());
		
		System.out.println("Enter a withdraw value: ");
		balance = sc.nextDouble();
		ac.withdraw(balance);
		
		System.out.println("Updated account: ");
		System.out.printf("Account: " + ac.toString());
		
		sc.close();
	}

}
