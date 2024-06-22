package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = sc.nextInt();
		
		for (int i=1; i<=numberOfProducts; i++) {
			System.out.println("Product #"+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'c') {
				productList.add(new Product(name, price));
				
			} else if (ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				productList.add(new UsedProduct(name, price, date));
				
			} else {
				System.out.println("Importing rate: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}	
		}
		
		System.out.println("\n###############");
		System.out.println("PRICE TAGS: ");
		for (Product product : productList) {
			System.out.println(product.priceTag());
			
		}
		
		
		sc.close();
		
	}
	
}
