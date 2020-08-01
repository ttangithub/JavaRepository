package com.ttan.java8;

import java.util.ArrayList;
import java.util.List;

public class AppleUtility {
	
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		
		List<Apple> result = new ArrayList<Apple>();
		
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
		
	}

}
