package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the Dollar price ? ");
		double price = sc.nextDouble();
		
		System.out.print("How any Dollars will be bought ? ");
		double quantity = sc.nextDouble();
		
		double total = CurrencyConverter.converter(price, quantity);
		
		System.out.printf("Amount to be paid in Real = %.2f%n ", total);
		
		sc.close();
	}

}
