/**
 * 
 */
package com.practice.threads.waitnotifyevenodd;

/**
 * @author anup
 *
 */
public class PrintOddEvenNumbersMain {

	boolean odd;
	int count = 1;
	int MAX = 20;
	
	public void printOddNumber(){
	
		synchronized (this) {
			
			while(count < MAX){
			
				while( !odd ){
				
					
					try {
						System.out.println("Odd is waiting");
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(count);
				count++;
				odd = false;
				notify();
			}
			
			
		}
		
	}
	
	public void printEvenNumber() {
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		synchronized (this) {
			
			while(count < MAX){
			
				while( odd ){
				
					
					try {
						System.out.println("Even is waiting");
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(count);
				count++;
				odd = true;
				notify();
			}
			
			
		}

	}
	
	public static void main(String[] args) {
		
		PrintOddEvenNumbersMain op = new PrintOddEvenNumbersMain();
		op.odd = true;
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				op.printEvenNumber();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				op.printOddNumber();
				
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
		
		
	}

}
