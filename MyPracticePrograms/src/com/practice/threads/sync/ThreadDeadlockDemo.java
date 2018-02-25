/**
 * 
 */
package com.practice.threads.sync;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author anup
 *
 */
public class ThreadDeadlockDemo implements Runnable{

	/**
	 * @param args
	 */
	static HashMap<Integer, String> hmap = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*hmap.put(1, "a");
		hmap.put(2, "a");
		hmap.put(3, "a");
		hmap.put(4, "a");
		hmap.put(5, "a");
		
		Set<Map.Entry<Integer, String> > entries = hmap.entrySet();
		
		for(Entry<Integer, String> entry: entries){
			
			System.out.println("Key = "+ entry.getKey() +" Value = "+ entry.getValue());
			
		}
		
		hmap.put(6, "b");*/
		
		/*HashMap<Integer, String> hmap = new HashMap<>();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				hmap.put(1, "a");
				hmap.put(2, "b");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				hmap.put(3, "c");
				hmap.put(4, "d");
			}
		});

		
		t1.start();
		t2.start();
		
		System.out.println(hmap);*/
		
		
		Thread t1 = new Thread(new ThreadDeadlockDemo(), "t1");
		Thread t2 = new Thread(new ThreadDeadlockDemo() , "t2");
		
		t1.start();
		t2.start();
		
		System.out.println(hmap);
	}

	
	public static synchronized void modifyMap() {
		
		if(Thread.currentThread().getName().equals("t1")){
		hmap.put(1, "a");
		hmap.put(2, "b");
		}
		else if(Thread.currentThread().getName().equals("t2")){
		hmap.put(3, "c");
		hmap.put(4, "d");
		hmap.put(5, "f");
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		modifyMap();
		
	}

}
