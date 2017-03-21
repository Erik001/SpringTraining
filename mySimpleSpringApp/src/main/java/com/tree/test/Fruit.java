package com.tree.test;

import java.util.List;
import java.util.Map;

public class Fruit {

	private String myName;

	private List<String> fruitNameList;
	private Map<String, String> fruitNameMap;

	public Fruit() {
	}

	public Fruit(String myName) {
		super();
		this.myName = myName;
	}

	public String talkAboutYourself() {
		String speech = "Hi I am a fruit. I come from plants or trees with seeds.";
		if (myName != null && myName != "")
			speech = speech + " My name is " + myName;
		return speech;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public List<String> getFruitNameList() {
		return fruitNameList;
	}

	public void setFruitNameList(List<String> fruitNameList) {
		this.fruitNameList = fruitNameList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

}
