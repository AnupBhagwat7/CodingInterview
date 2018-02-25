/**
 * 
 */
package com.practice.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author anup
 *
 */

class Manus implements Cloneable{
	
	private String name;
	private int height;
	private Address address ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
		
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Manus(String name, int height, Address address) {
		super();
		this.name = name;
		this.height = height;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Manus [name=" + name + ", height=" + height + ", address=" + address + "]";
	}
	public Object clone() {
		
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return this;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize called in Manus");
		super.finalize();
	} 
	
}

class Address{
	
	String adress;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Address(String adress) {
		super();
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Address [adress=" + adress + "]";
	}
	

}

public class ManusTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address("Pune");
		Manus m1 = new Manus("Anup", 6,add);
		
		System.out.println(m1);
		//m1.setAddress(new Address("Baramati"));
		System.out.println();
		Manus m = (Manus) m1.clone();
		Address add1 = m.getAddress();
		add1.setAdress("Baramati");
		
		
		System.out.println(m);
		System.out.println(m1);

		m = null;
		System.gc();
		System.out.println(m);
		
		System.out.println(m1   +"  " + m1.clone());
	}

	
}
