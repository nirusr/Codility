package com.srini.threading;
import java.util.Scanner;

public class VolatileEx implements Runnable{
	public volatile boolean running = true;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running) {
			System.out.println("Hello-");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}
	public void shutdown() {
		running = false;
	}
	public static void main(String[] args) {
		VolatileEx vx = new VolatileEx();
		Thread t = new Thread(vx);
		t.start();
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		vx.shutdown();
		sc.close();
	}
	
	

}
