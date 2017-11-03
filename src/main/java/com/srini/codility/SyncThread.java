package com.srini.codility;

public class SyncThread {
	
	private int counter = 0;
	public synchronized void increment() {
		counter++;
	}
	public void dowork() {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(counter);
		
	}
	public static void main(String[] args) {
		SyncThread st = new SyncThread();
		st.dowork();
	}

}
