package com.tree.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorAnnotatedProperty {
	
	@Autowired
	private SpellChecker spellChecker;
	
	
	
	public TextEditorAnnotatedProperty() {
		System.out.println("Inside TextEditorAnnotatedProperty Constructor");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpeling();
	}
}
