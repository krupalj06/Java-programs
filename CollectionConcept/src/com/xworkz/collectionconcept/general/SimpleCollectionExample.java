package com.xworkz.collectionconcept.general;

import java.util.ArrayList;

public class SimpleCollectionExample {
	
	public static void main(String[] args) {
		
		ArrayList elements = new ArrayList();
		elements.add("Name");
		elements.add(10);
		elements.add('A');
		elements.add(20.00);
		elements.add(true);
		elements.add(null);

		System.out.println(elements);
		
		boolean result = elements.contains("Name");
		System.out.println("Does collection contain name?? : "+result);
		
		boolean result2 = elements.contains(false);
		System.out.println("Does collection contain false?? : "+result2);
		
		elements.remove("Name");
		System.out.println(elements);
	}
	

}
