/**
 * 
 */
package com.practice.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author anup
 *
 */


class Country implements Comparable<Country>{
	
	private String countryCode;
	private String countryName;
	private Long pop;
	
	public Country(String countryCode, String countryName, Long pop) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.pop = pop;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Long getPop() {
		return pop;
	}
	public void setPop(Long pop) {
		this.pop = pop;
	}

	@Override
	public int compareTo(Country o) {
		if (this.getPop() > o.getPop() ){
			return 1;
		}else if (this.getPop() < o.getPop() ){
			return -1;
		}else{
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", pop=" + pop + "]";
	}
	
}

public class CSVReader {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D://DATA//STUDY//anup//Interview//Programs//data.csv"));
			String line;
			Set<Country> countrySet = new TreeSet<>();
			Country country = null;
			
			while((line = br.readLine())  != null){
				
				String[] fields = line.split(",");
				
				country = new Country( fields[4].replace("\"", ""), fields[5].replace("\"", ""),Long.parseLong(fields[2].replace("\"", "")));
				countrySet.add(country);
			}
			
			countrySet.forEach(n -> System.out.println(n+" "+ n.hashCode()));
			
			String s = " asdasd";
			s = null;
			Runtime.getRuntime().gc();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
		}
		
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	} 
	
}
