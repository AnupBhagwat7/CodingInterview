/**
Given a line of text, verify that the beginning and ending parenthesis match up.
 * 
 */
package com.practice.java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

interface Addable{
	public int add(int a, int b) ;
}

@FunctionalInterface
interface Printable{
	public String showMsg(String msg);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Addable a1 = (a,b) -> (a+b);
			System.out.println(a1.add(10, 20));
		
		Printable p = (msg)-> {
			return("Hello ,"+ msg);
		};
		
		p.showMsg("Anup");
		
		
	    List<String> list1=new LinkedList<String>();  
        list1.add("ankit");  
        list1.add("mayank");  
        list1.add("irfan");  
        list1.add("jai");  
          
        list1.forEach(  
            (n)->System.out.println(n)  
        );  
        
        
        Map<Integer , String> map=new HashMap<Integer, String>();  
        map.put(1, "Anup");
        map.put(2, "Archu");
        map.put(3, "Akshay");
        map.put(41, "Andy");
        
        map.forEach(
        
        		(k,v) -> {System.out.println(k +":"+ v);}
        );
        
        
        //Filter
        List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product> filtered_data = list.stream().filter(p1 -> p1.id > 3);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.name+": "+product.price)  
        );  
        
        System.out.println(list.parallelStream().filter(n -> n.price > 20000));
        
	}
}