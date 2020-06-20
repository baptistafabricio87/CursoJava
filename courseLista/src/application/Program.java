package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maria");
		list.add("Bob");
		list.add("Marcio");
		list.add("Alex");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
//		list.remove(1);
		// remove 
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
	}

}
