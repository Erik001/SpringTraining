package com.tree.spring.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorAnnotatedSetter {

	private Float version;

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public Float getVersion() {
		return version;
	}

	@Autowired(required = false)
	public void setVersion(Float version) {
		this.version = version;
	}

	public void spellCheck() {
		spellChecker.checkSpeling();
	}

}
