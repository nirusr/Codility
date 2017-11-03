package com.srini.codility;
public class SingletonExample implements Runnable{

    public static SingletonExample singletonExample;
    
    //constructor
    private SingletonExample() {
    }
    
    public static synchronized SingletonExample getInstance() {
        
        if ( singletonExample == null ) {
            System.out.println("Instance created");
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }
    
    public void printInstance() {
        System.out.println("Instance is avaialble");
        
    }


    public static void main(String[] args) {
    
    		for (int i = 1; i < 5; i++ ) {
    			Thread t = new Thread(new SingletonExample());
    			t.start();
    		}
       
    }

	@Override
	public void run() {
		SingletonExample.getInstance().printInstance();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}