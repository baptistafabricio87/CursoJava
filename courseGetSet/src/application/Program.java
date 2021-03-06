package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in Stock:  ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);

	//	Utilização dos metodos get e set 	
		product.setName("Computer");
		System.out.println("Updated Name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
		System.out.println(" ");
		System.out.println("Product data: " + product);
		
		System.out.println(" ");
		System.out.println("Enter the number of products to be added in Stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
