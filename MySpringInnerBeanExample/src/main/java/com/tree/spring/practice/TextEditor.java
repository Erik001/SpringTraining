package com.tree.spring.practice;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor(){
		
	}
	
	/*public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor Constructor.");
		this.spellChecker = spellChecker;
	}*/
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
