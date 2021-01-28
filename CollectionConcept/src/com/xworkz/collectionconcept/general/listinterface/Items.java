package com.xworkz.collectionconcept.general.listinterface;

public class Items {
	
	private String itemName;
    private double itemCost;
    private int discount;
    
	public Items(String itemName, double itemCost, int discount) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.discount = discount;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemCost() {
		return itemCost;
	}
	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "DepartmentStore [itemName=" + itemName + ", itemCost=" + itemCost + ", discount=" + discount + "]";
	}
    
}
