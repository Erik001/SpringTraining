package com.tree.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorAnnotatedConstructor {
	
	
	private SpellChecker spellChecker;
	
	@Autowired
	public TextEditorAnnotatedConstructor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditorAnnotatedConstructor Constructor");
		this.spellChecker = spellChecker;
		
	}

	public void spellCheck() {
		spellChecker.checkSpeling();
	}

}
