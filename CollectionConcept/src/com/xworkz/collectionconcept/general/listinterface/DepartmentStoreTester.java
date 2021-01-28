package com.xworkz.collectionconcept.general.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class DepartmentStoreTester {

	public static void main(String[] args) {
		
		Items it1 = new Items("Rice", 35.00, 10);
		Items it2 = new Items("Sugar", 50.00, 8);
		Items it3 = new Items("Medicens", 10.00	, 5);
		Items it4 = new Items("Fruit", 60.00, 6);
		Items it5 = new Items("Vegitables", 30.00, 0);
		
		ArrayList<Items> departmentStore = new ArrayList<Items>();
		departmentStore.add(it1);
		departmentStore.add(it2);
		departmentStore.add(it3);
		departmentStore.add(it4);
		departmentStore.add(it5);
		
		System.out.println("Sort based on price :");
		SortByPrice sortbyprice = new SortByPrice();
		Collections.sort(departmentStore , sortbyprice );
		System.out.println(departmentStore);
		
		System.out.println("Sort based name of item ");
		SortByItemName sortByItemName = new SortByItemName();
		Collections.sort(departmentStore,sortByItemName);
		System.out.println(departmentStore);
		
		
		//Traverse using Listiterator:
		ListIterator<Items> listItr = departmentStore.listIterator();
		System.out.println("List in forward direction");
		while(listItr.hasNext()) {
			System.out.println("index is " + listItr.nextIndex());
			Items it = listItr.next();
			System.out.println(it);
			if(it.getItemCost() == 50.00) {
				listItr.add(new Items("WheatFlour", 40.00, 5));
//				listItr.set(e);
			}
		}
		
		System.out.println("List in reverse direction");
		while (listItr.hasPrevious()) {
			System.out.println("index is " + listItr.previousIndex());
			Items it = listItr.previous();
			System.out.println(it);
		}
	}
}
