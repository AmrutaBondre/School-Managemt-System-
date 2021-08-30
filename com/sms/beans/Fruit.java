package com.sms.beans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fruit implements Comparable<Fruit>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//
	//The Comparable interface is only allow to sort a single property
	//
	
	/*
	@Override
	public int compareTo(Fruit o) {
		if(this.quantity > o.quantity)
			return 1;
		else if(this.quantity < o.quantity)
			return -1;
		return 0;
	}*/
	
	@Override
	public int compareTo(Fruit o) {
		if(this.fruitName.compareTo(o.fruitName) > 0)
			return 1;
		else if(this.fruitName.compareTo(o.fruitName) < 0)
			return -1;
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(new Fruit("Pineapple", "Pineapple description",70));
		fruitsList.add(new Fruit("Apple", "Apple description",100));
		fruitsList.add(new Fruit("Orange", "Orange description",80));
		fruitsList.add(new Fruit("Banana", "Banana description",90));
		
		//Collections.sort(fruitsList);
		
		Collections.sort(fruitsList,Fruit.dateTimeComparator);
		
		for(Fruit temp : fruitsList){
			System.out.println( temp.getFruitName() 
								+ " : " + temp.getFruitDesc()
								+ " : " + temp.getQuantity());
		}
	}
	
	static Comparator<Fruit> dateTimeComparator = new Comparator<Fruit>(){

		@Override
		public int compare(Fruit o1, Fruit o2) {
			if((o1.fruitName.compareTo(o2.fruitName)) != 0)
				return -o1.fruitName.compareTo(o2.fruitName);
			else if((o1.fruitDesc.compareTo(o2.fruitDesc)) != 0)
				return -o1.fruitDesc.compareTo(o2.fruitDesc);
			return -o1.fruitName.compareTo(o2.fruitName);
		}
		
	};
	
}
