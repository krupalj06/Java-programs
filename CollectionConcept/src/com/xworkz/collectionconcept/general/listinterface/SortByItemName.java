package com.xworkz.collectionconcept.general.listinterface;

import java.util.Comparator;

public class SortByItemName implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		return o1.getItemName().compareTo(o2.getItemName());
	}

}
