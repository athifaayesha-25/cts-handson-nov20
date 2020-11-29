package com.org;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Thread t1 = new Thread(counter, "A");
		Thread t2 = new Thread(counter, "B");
		t1.start();
		t2.start();
		System.out.println("---End of program---");

	}

}
