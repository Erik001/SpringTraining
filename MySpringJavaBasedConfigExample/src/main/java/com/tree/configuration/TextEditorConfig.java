package com.tree.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tree.spring.practice.SpellChecker;
import com.tree.spring.practice.TextEditor;

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	private SpellChecker spellChecker() {	
		return new SpellChecker();
	}
}
