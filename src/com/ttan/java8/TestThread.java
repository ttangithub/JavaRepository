package com.ttan.java8;

public class TestThread {

	public static void main(String[] args) {
		
		Thread t = new Thread(()->System.out.println("Hello Thread World"));
		t.run();
		
	}

}
