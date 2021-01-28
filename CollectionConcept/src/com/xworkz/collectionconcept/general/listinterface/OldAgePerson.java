package com.xworkz.collectionconcept.general.listinterface;

public class OldAgePerson implements Comparable<OldAgePerson>{
	
	private int age;
	private String name;
	private String address;
	
	public OldAgePerson(int age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "OldAgePerson [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(OldAgePerson o) {
//		return this.getAge() - o.getAge();            // obj1.compareTo(obj2)   obj1 - obj2  // -ve, 0 , +ve
		return this.getName().compareTo(o.getName());  
		//String compareTo ; int,short -> obj.get***() - obj2.get***()
	}

}
