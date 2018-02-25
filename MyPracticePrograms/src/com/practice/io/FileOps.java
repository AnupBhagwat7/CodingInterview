/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Stack;

public class FileOps {

	public static void main(String[] args) {
		
/*		int i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character  
		*/
		
		//FileOutputStream 
		try{    
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
        
        String s = "Hello i am here";
        byte[] bytes = s.getBytes();
        fout.write(bytes);    
        fout.close();    
        System.out.println("success...");    
       }catch(Exception e){System.out.println(e);}  
		
		//FileOutputStream
		FileOutputStream file;
		try {
			file = new FileOutputStream("D:\\testout1.txt");
			DataOutputStream data = new DataOutputStream(file);  
	        data.writeFloat(12f);  
	        data.flush();  
	        data.close();  
	        System.out.println("Succcess..."); 
	        
	        FileInputStream fis = new FileInputStream("D:\\testout1.txt");
	        DataInputStream dis = new DataInputStream(fis);
	        
	        while(dis.read() != -1){
	        	System.out.println(dis.read());
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
		
		//Console
		//String pwd = System.console().readLine();
		//System.out.println(String.valueOf(pwd));
		
		//Writer
		try {
			Writer w = new FileWriter("D:\\writer.txt");
			
			w.write("Hello. i am anup...");
			w.flush();
			w.close();
			
			@SuppressWarnings("resource")
			Reader r = new FileReader("D:\\writer.txt");
			System.out.println(r.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}