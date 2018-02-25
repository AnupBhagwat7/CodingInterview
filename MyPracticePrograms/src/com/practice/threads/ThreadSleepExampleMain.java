package com.practice.threads;

class FirstThread implements Runnable {

	public void run() {
		//System.out.println("Thread is running");
		
		print();
	}

	public  void print() {
		
		try {
			
			//synchronized (this) {
				Thread.sleep(4000);
				
				for(int i=0; i< 5 ; i++)
				System.out.println("Printing from Thread : "+ Thread.currentThread());
			//}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}

public class ThreadSleepExampleMain {

	public static void main(String args[]) {
		FirstThread ft = new FirstThread();

		Thread t = new Thread(ft);
		Thread t1 = new Thread(ft);
		Thread t2 = new Thread(ft);
		
		t.start();
		t1.start();
		t2.start();
		
		/*long startTime = System.currentTimeMillis();
		try {
			// putting thread on sleep
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		long timeDifference = (endTime - startTime);
		System.out.println("Time difference between before and after sleep call: " + timeDifference);*/
	}

}