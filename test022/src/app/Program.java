package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("\nShape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color inputColor = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double inputWidth = sc.nextDouble();
				System.out.print("Height: ");
				double inputHeight = sc.nextDouble();	
				list.add(new Rectangle(inputColor, inputWidth, inputHeight));
				
			} else {
				System.out.print("Radius: ");
				double inputRadius = sc.nextDouble();
				list.add(new Circle(inputColor, inputRadius));
			}
		}
		
		System.out.println("\n############################");
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}	
		
		sc.close();
	}
}
