package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>(); // Does not order
		//Set<String> set = new TreeSet<>(); // Order
		Set<String> set = new LinkedHashSet<>(); // maintains the order in which elements were inserted
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		
		//System.out.println(set.contains("Notebook"));
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
		
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}