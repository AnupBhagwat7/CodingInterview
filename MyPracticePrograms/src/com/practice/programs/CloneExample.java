/**
 * 
 */
package com.practice.programs;

/**
 * @author anup
 *
 */
public class CloneExample implements Cloneable{

	/**
	 * @param args
	 */
	private int id;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneExample c1 = new CloneExample();
		c1.id = 10;
		
		try {
			CloneExample c2 = (CloneExample) c1.clone();
			
			System.out.println(c1.id  +"   "+ c2.id);
			
			c1.id = 20;
			
			System.out.println(c1.id  +"   "+ c2.id);
			
			System.out.println(c1.hashCode()  +"    "+ c2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
