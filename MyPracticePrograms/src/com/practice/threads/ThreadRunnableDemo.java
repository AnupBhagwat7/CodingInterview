/**
 * 
 */
package com.practice.threads;

/**
 * @author anup
 *
 */

class ThreadRunnable implements Runnable{

	private int i;
	
	@Override
	public void run() {
		
		for(i= 0 ; i< 5 ; i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Looping in " + Thread.currentThread().getName()+"   "+  i);
		}
	}
}


public class ThreadRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new ThreadRunnable());
		Thread t2 = new Thread(new ThreadRunnable());
		Thread t3 = new Thread(new ThreadRunnable());
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName());
		
		t3.start();
	}

}
