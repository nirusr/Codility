package com.srini.threading;

public class ThreadEx2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10 ; i ++ ) {
			System.out.println("Hello-" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		ThreadEx2 ex1 = new ThreadEx2();
		Thread t1 = new Thread(ex1);
		t1.start();
		//t1.start();
		ThreadEx2 ex2 = new ThreadEx2();
		Thread t2 = new Thread(ex2);
		//t2.start();
		
	}

}
