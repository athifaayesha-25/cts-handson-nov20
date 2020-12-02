package com.org;

public class Counter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		for(int i=1;i<=100;i++){
			System.out.println("Counter: "+i+", name is: "+t.getName());
		}
		
	}

}
