package com.ttan.singleton;

public class FirstSingleton {
	
	public static final FirstSingleton INSTANCE = new FirstSingleton();
	private FirstSingleton() {}
	
	// main
	//
	public static void main(String argv[]) {
		FirstSingleton myFirst = FirstSingleton.INSTANCE;
	}

}
