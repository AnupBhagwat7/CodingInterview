package com.practice.ideas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FindExpiredSoftware {
	public static void main(String[] args) throws IOException {

		/*File file = new File("./input.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		
		while(line != null){
			
			System.out.println(line);
		}*/
	
		
		InputStream fileIs = FindExpiredSoftware.class
				.getResourceAsStream("input.txt");
		
		// now just do something with your file
		try (BufferedReader br = new BufferedReader(new InputStreamReader(fileIs))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	System.out.println(line);
		    }
		}
		
		
		
	}
}