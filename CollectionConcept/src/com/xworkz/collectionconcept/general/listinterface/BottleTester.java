package com.xworkz.collectionconcept.general.listinterface;

import java.util.ArrayList;

public class BottleTester {
	
	public static void main(String[] args) {
		
		Bottle plasticBottle = new Bottle("purple", "round", "plastic", 50.00);
		Bottle copperBottle = new Bottle("CopperColor", "oval", "copper", 500.00);
		Bottle glassBottle = new Bottle("transparent", "square", "glass", 70.00);
		
		ArrayList<Bottle> bottles = new ArrayList<Bottle>();
		bottles.add(plasticBottle);
		bottles.add(copperBottle);
		bottles.add(glassBottle);
		bottles.add(new Bottle("grey", "round", "steel", 70.00));
		
		System.out.println(bottles);
		
		System.out.println("Is copper bottle avialable method1 : "+bottles.contains(copperBottle));
		System.out.println("Is copper bottle avialable method1 : "+ bottles.contains(new Bottle("CopperColor", "oval", "copper", 500.00)));
		
		System.out.println("First element is : "+ bottles.get(0));
		
		//2 customised
	}

}
