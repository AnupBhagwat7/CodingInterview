/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.threads;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		
		for(int i= 0 ; i< 5 ; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(Thread.currentThread().isDaemon())
				System.out.println("Looping in deamon thread " + Thread.currentThread().getName()+"   "+  i);
			else
				System.out.println("Looping in " + Thread.currentThread().getName()+"   "+  i);
		}
		
	}
	
	
	
	
}



public class DeamonThreadDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread1(), "Normal1");
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new MyThread1(), "Deamon");
		Thread t3 = new Thread(new MyThread1(), "Normal2");
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}