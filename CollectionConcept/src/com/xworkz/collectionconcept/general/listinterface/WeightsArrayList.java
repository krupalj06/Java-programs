package com.xworkz.collectionconcept.general.listinterface;

import java.util.ArrayList;
import java.util.Collections;

public class WeightsArrayList {
	public static void main(String[] args) {
		
	  ArrayList<Float> weights = new ArrayList<Float>();
	  weights.add(0.5f); //autoboxing
	  weights.add(1.0f);
	  weights.add(2.5f);
	  weights.add(1.5f);
	  weights.add(2.0f);
	  weights.add(2, 3.0f);
	  
	  System.out.println(weights);
	  
	  //Travese1
	  System.out.println("===========Travese1==============");
	  for(int i = 0 ; i<weights.size() ; i++ ) {
		 System.out.println("Element in index : "+ i + " = " + weights.get(i));
	  }
	  
	  //Travese2
	  System.out.println("===========Travese2==============");
	  for(Float ref : weights) {
		  System.out.println("ele: "+ ref);
	  }
	  
	  //Sorting 
      Collections.sort(weights);
      
      //descending
      Collections.reverse(weights);
	  
      System.out.println("New Weights: ");
      System.out.println(weights);
	}

}
