package com.xworkz.collectionconcept.general.listinterface;

public class Bottle {
	
	private String color;
	private String shape;
	private String material;
	private double cost;
	
	public Bottle(String color, String shape, String material, double cost) {
		super();
		this.color = color;
		this.shape = shape;
		this.material = material;
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	void drinking() {
		System.out.println("Drinking from bottle");
	}

	void decorative() {
		System.out.println("Use for decoration");
	}

	@Override
	public String toString() {
		return "Bottle [color=" + color + ", shape=" + shape + ", material=" + material + ", cost=" + cost + "]";
	}
	

}
