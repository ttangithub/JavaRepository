package com.ttan.java8;

import java.util.ArrayList;
import java.util.List;

public class TestApple {
	
	private List<Apple> inventory = new ArrayList<Apple>();
	
	public List<Apple> getInventory() {
		return inventory;
	}

	public TestApple() {
		inventory.add(new Apple("red", 15));
		inventory.add(new Apple("green", 150));
		inventory.add(new Apple("red", 150));
		inventory.add(new Apple("red", 100));
		inventory.add(new Apple("red", 200));
		inventory.add(new Apple("red", 210));
		inventory.add(new Apple("green", 160));
		inventory.add(new Apple("green", 170));
		inventory.add(new Apple("green", 180));
		inventory.add(new Apple("red", 160));
	}
	
	public void displayApples(List<Apple> myinventory) {
		
		if (myinventory.isEmpty()) {
			System.out.println("No apple left");
			return;
		}
		
		for (Apple apple : myinventory) {
			System.out.println(apple.getColor() + " apple with weight " + apple.getWeight());
		}
		
	}

	public static void main(String[] args) {
		
		TestApple myApple = new TestApple();
		
		List<Apple> greenApples = AppleUtility.filterApples(myApple.getInventory(), new AppleGreenColorPredicate());

		myApple.displayApples(greenApples);
		
		System.out.println("==========================================");
		
		List<Apple> redApples = AppleUtility.filterApples(myApple.getInventory(), 
				(Apple apple)->"red".equals(apple.getColor()));
		
		myApple.displayApples(redApples);
		
	}

}
