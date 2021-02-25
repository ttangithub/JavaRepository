package com.ttan.singleton;

public class SecondSingleton {
	
	private static final SecondSingleton INSTANCE = new SecondSingleton();
	private SecondSingleton() {}
	public static SecondSingleton getInstance() {
		return INSTANCE;
	}

	// main
	//
	public static void main(String[] args) {
		
		SecondSingleton mySecond = SecondSingleton.getInstance();

	}

}
