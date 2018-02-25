/**
 * 
 */
package com.practice.threads.executor;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author anup
 *
 */
public class ExecutorMain{

	
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		
		/*for(int i=0; i < 10 ; i++){
			
			Runnable r = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					Random rad = new Random();
					
					try {
						Thread.sleep(rad.nextInt(1000));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("From thread "+ Thread.currentThread().getName());
				}
			};
			
			//Thread t = new Thread(r);
			//t.start();
			
			es.execute(r);
			
			
		}*/
		
		
		
				
		for(int i=0 ; i< 10 ; i++){
				
			Callable<Integer> c= 	new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {

				Random rad = new Random();
				int delay = rad.nextInt(1000);
				
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("From thread "+ Thread.currentThread().getName());
				
				return delay;
			}
			};
		
			Future< Integer> future =   es.submit(c);
			
			try {
				System.out.println(future.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		es.shutdown();
	}

}
