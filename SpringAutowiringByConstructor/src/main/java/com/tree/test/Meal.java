package com.tree.test;

public class Meal {

	private Fruit fruit;
	private Dairy dairy;
	private Grain grain;
	private Meat meat;
	private Vegetable vegetable;
	
	public Meal(){
		
	}

	public Meal(Fruit fruit,Vegetable vegetable, Dairy dairy, Meat meat, Grain grain) {
		super();
		this.fruit = fruit;
		this.dairy = dairy;
		this.grain = grain;
		this.meat = meat;
		this.vegetable = vegetable;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public Dairy getDairy() {
		return dairy;
	}


	public Grain getGrain() {
		return grain;
	}


	public Meat getMeat() {
		return meat;
	}


	public Vegetable getVegetable() {
		return vegetable;
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
