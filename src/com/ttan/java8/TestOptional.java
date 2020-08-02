package com.ttan.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {
	
	private List<Optional<String>> words = new ArrayList<Optional<String>>();
	
	public List<Optional<String>> getWords() {
		return words;
	}

	public TestOptional() {
		words.add(Optional.of("Hello World"));
		words.add(Optional.empty());
		words.add(Optional.of("Hello World of Paris"));
	}

	public static void main(String[] args) {
		
		TestOptional myTest = new TestOptional();
		
		List<Optional<String>> result = myTest.getWords();
		
		for (Optional<String> name : result) {
			
			name.ifPresent(v->System.out.println("String length is " + v.length()));
			
		}

	}

}
