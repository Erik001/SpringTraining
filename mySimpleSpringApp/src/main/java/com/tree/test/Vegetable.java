package com.tree.test;

public class Vegetable {
	
	private String myName;
	
	
	public String talkAboutYourself() {
		String speech = "Hi I am a vaegetable. I am a plant that is eaten as food.";
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
