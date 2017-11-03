package com.srini.threading;

public class ThreadEx1  extends Thread{
	public void run() {
		for (int i = 0; i< 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1();
		t1.start();
		
		ThreadEx1 t2 = new ThreadEx1();
		t2.start();
	}
}
