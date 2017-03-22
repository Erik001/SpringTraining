package com.tree.spring.practice;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(){
		
	}
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor Constructor.");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
