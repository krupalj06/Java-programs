package com.xworkz.collectionconcept.general.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class OldAgeHomeTester {
	
	public static void main(String[] args) {
		
		OldAgePerson p1 = new OldAgePerson(80, "Suhas", "Banglore");
		OldAgePerson p2 = new OldAgePerson(82, "Tony", "Mysore");
		OldAgePerson p3 = new OldAgePerson(78, "John", "Manglore");
		OldAgePerson p4 = new OldAgePerson(65, "Srinivas", "Gulbarga");
		OldAgePerson p5 = new OldAgePerson(70, "Rekha", "Hubli");
		
		
		ArrayList<OldAgePerson> oldAgeHome = new ArrayList<OldAgePerson>();
		oldAgeHome.add(p1);
		oldAgeHome.add(p2);
		oldAgeHome.add(p3);
		oldAgeHome.add(p4);
		oldAgeHome.add(p5);
		
		System.out.println(oldAgeHome);
		
		System.out.println("Priniting records whose age is above 70");
		for (OldAgePerson person : oldAgeHome) {
			if(person.getAge() >= 70) {
				System.out.println(person);
			}
			//....
		}
		
		System.out.println("update each of the person's age by 1 year whose age is less than 80");
		
		for (OldAgePerson person : oldAgeHome) {
			if(person.getAge() < 80) {
//				int currentAge = person.getAge();
				person.setAge(person.getAge()+1);
			}
			System.out.println(person);
		}
		
		/*System.out.println("Remove Person with age 82");
		for (OldAgePerson person : oldAgeHome) {
			if(person.getAge() == 82) {
				System.out.println("Removing person with age 82");
				oldAgeHome.remove(person);
			}
		}*/
		
		//Traversing : Iterator
		Iterator<OldAgePerson> itr = oldAgeHome.iterator();  //Virtual copy of collection
		
		//boolean hasnext(), Element next(), remove()
		
		
		while(itr.hasNext()) {
			OldAgePerson person = itr.next();
			if(person.getAge() == 82) {
				System.out.println("Removing person with age 82");
				itr.remove();
			}
		}
		System.out.println(oldAgeHome);
		
		
		Collections.sort(oldAgeHome);
		System.out.println("After sorting based on age");
		System.out.println(oldAgeHome);
		
	}

}
