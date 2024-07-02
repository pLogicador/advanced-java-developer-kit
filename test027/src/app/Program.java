package app;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strpath = sc.nextLine();
		
		File path = new File(strpath);
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getPath: "+ path.getPath());
		System.out.println("getAbsolutePath: "+ path.getAbsolutePath());
		
		sc.close();
	}
}
