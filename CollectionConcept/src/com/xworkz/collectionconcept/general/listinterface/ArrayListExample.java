package com.xworkz.collectionconcept.general.listinterface;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		//Integers
		ArrayList<String> names = new ArrayList<String>();  //Generics
		
		//add
		names.add("krupa");
		names.add("Sumana");
		names.add("Manasa");
		names.add("krupa"); // duplicates allowed
		names.add(null);  //null is allowed
		
		System.out.println(names);  // maintains insertion order
		// Collections override toString() to display the elements in the collection
		
		names.add(4, "Prerana");
		names.add(2,"Jony");
		System.out.println(names); 
		
		
		System.out.println("Size of names Array List is: " + names.size());
		
		System.out.println("Does the ArrayList contain name Prerana: " + names.contains("Prerana"));
		
		System.out.println("The Sixth element in the ArrayList is: "+ names.get(5));
		
		names.set(2, "Sushma"); // update the index with new value  + returns old value
		
		System.out.println(names);
		
		System.out.println("First index of name krupa is : " + names.indexOf("krupa"));
		
//		names.lastIndexOf(o) 
		
		names.remove(2);
		names.remove("krupa");
//		names.removeAll(c)
		
	}
	

}
