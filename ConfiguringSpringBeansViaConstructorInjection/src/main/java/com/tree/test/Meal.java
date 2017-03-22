package com.tree.test;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable vegetable;
	
	public Meal(){
		
	}

	public Meal(Fruit f, Dairy d, Grain g, Meat m, Vegetable v) {
		super();
		this.fruit = f;
		this.dairy = d;
		this.grain = g;
		this.meat = m;
		this.vegetable = v;
	}

	public String whatsInThisMeal() {
		String answer = "This meal contains: ";
		if (fruit != null)
			answer += "some fruit: ";
		if (dairy != null)
			answer += "some dary: ";
		if (grain != null)
			answer += "some grain: ";
		if (meat != null)
			answer += "some meat: ";
		if (vegetable != null)
			answer += "some vegetables: ";
		return answer;
	}

}
