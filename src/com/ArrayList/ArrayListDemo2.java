package com.ArrayList;

import java.util.ArrayList;

import java.util.Iterator;
public class ArrayListDemo2 {
	
	public static void getAllArrayList(ArrayList<String> products) {	
		for (String product : products) {	
			System.out.println(product);
			}
	}
	
	public static void main(String[] args) {
		
	ArrayList <String> dairyProducts = new ArrayList<>();
	
	dairyProducts.add("milk");
	dairyProducts.add("curd");
	dairyProducts.add("ghee");
	dairyProducts.add("cheese");
	dairyProducts.add("sweet");
	
//	Iterator<String> itr = dairyProducts.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//		
//	}
	
	ArrayList<String> fruits = new ArrayList<>();
	fruits.add("banana");
	fruits.add("mango");
	fruits.add("apple");
	fruits.add("kiwi");
	fruits.add("graphes");
	
//	Iterator<String> itr1 = fruits.iterator();
//	while(itr1.hasNext()) {
//		System.out.println(itr1.next());

//	to call two objects at one time
		ArrayList<String> products = new ArrayList<>(dairyProducts);
		products.addAll(fruits);
		System.out.println("--------1st type--------");
		
		for (String product : products) {			
			System.out.println(product);		
		}
		System.out.println("--------2nd type-------");
		
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i));
		}
		System.out.println("--------3rd type-----------");
		
		Iterator<String> itr2 = products.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("----------from java-8 version 4th type--------");
		products.forEach(System.out::println);
		System.out.println("--------By an method-----------");
		getAllArrayList(products);
}
}
