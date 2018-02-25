/**
 * 
 */
package com.practice.threads.sync;

/**
 * @author anup
 *
 */
public class SyncDemoMain{

	int count = 20;
	
	public synchronized int  incrementCount() {
		
		/*if(count == 100)
			System.exit(0);*/
		
		
		//synchronized (this) {
		
			count++;
			
			System.out.println("Count incremented by thread "+ Thread.currentThread().getName() +" is : "+ count);
			return count;
		//}
		
		
	}
	
	public static void main(String[] args) {
		
		SyncDemoMain sdm = new SyncDemoMain();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				sdm.incrementCount();
			}
		}, "One");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				sdm.incrementCount();
			}
		}, "two");
		
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				sdm.incrementCount();
			}
		}, "three");
		
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				sdm.incrementCount();
			}
		}, "four");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
