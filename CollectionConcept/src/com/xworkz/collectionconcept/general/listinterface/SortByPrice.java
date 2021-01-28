package com.xworkz.collectionconcept.general.listinterface;

import java.util.Comparator;

public class SortByPrice implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		return (int) (o1.getItemCost() - o2.getItemCost());
	}

}
