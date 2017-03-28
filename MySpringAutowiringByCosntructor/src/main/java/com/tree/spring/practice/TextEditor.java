package com.tree.spring.practice;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor(){
		
	}
	
	public TextEditor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}


	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}


	public String getName() {
		return name;
	}

}
