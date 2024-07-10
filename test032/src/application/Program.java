package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Beatriz", "bia@gmail.com");
		Client c2 = new Client("Beatriz", "bia@gmail.com");
		
		String s1 = "Wow";
		String s2 = "Wow";
		String sl1 = new String("Wow");
		String sl2 = new String("Wow");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println();
		System.out.println(c1.equals(c2));
		
		// Checks difference between memory locations instead of just content (equals)
		System.out.println(c1 == c2);
		
		// Special compiler handling
		System.out.println(s1 == s2);
		// No special treatment as there was a literal instantiation of the object
		System.out.println(sl1 == sl2);
	}

}
