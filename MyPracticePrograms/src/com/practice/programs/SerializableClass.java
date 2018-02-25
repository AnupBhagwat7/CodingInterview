/**
 * 
 */
package com.practice.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author anup
 *
 */
public class SerializableClass implements Serializable {

	/**
	 * @param args
	 */
	private int id;
	private transient String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		SerializableClass c1 = new SerializableClass(10, "");
		
		FileOutputStream fos = new FileOutputStream("anup.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		oos.close();
		fos.close();
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public SerializableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}


class DeSerializableClass{
	
	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("anup.txt"));
			
			SerializableClass obj =   (SerializableClass) ois.readObject();
			
			System.out.println(obj);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
