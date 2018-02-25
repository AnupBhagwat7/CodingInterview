/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.threads;

class MyThread extends Thread{
	
	public void run() {
		
		printValues();
	}
	
	public void printValues(){
		for(int i=0; i < 6 ; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (this) {
				System.out.println("Value from "+Thread.currentThread().getName() +" is "+ i);	
			}
			
		}
	}
	
}



public class ThreadDemo {

	public static void main(String[] args) {
		
		
		MyThread t1 = new MyThread();
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread t2 = new MyThread();
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.start();
		
	}
}