package com.tree.test;

public class Fruit {

	private String myName;

	public Fruit() {
	}

	public Fruit(String myName) {
		super();
		this.myName = myName;
	}

	public String talkAboutYourself() {
		String speech = "Hi I am a fruit. I come from plants or trees with seeds.";
		if(myName != null && myName != "") speech = speech + " My name is " + myName;
		return speech;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

}
