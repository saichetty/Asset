package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo implements Cloneable {
	
		public static void main(String[] args) {
			
		// ArrayList is the pre-defined so by using the same name create instance instead of class name
			
	ArrayList object=new ArrayList(15);
	ArrayList object1=new ArrayList();
	object1.add(10);
	object1.add(12.123);
	object1.add(true);
	object1.add(561);
	object1.add("hello");
	object1.add('g');
	object1.add(new Student());
	object1.add(new Student(100,"sai","sai@gmail.com"));
	object1.add(100);
	object1.add(1, 21);
	object1.add(100);
	object1.add(1, 21);
	System.out.println(" Object 1 "+object1.size());
	
	
	System.out.println(object);
	
	Iterator itr= object.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	boolean position = object.contains("hello");
	
	if(position =true){
		System.out.println("Yes,its worked");
		System.out.println(("Okay it contains"+ "hello" ));
	}
	else {System.out.println("Error");
		}
	System.out.println("**************************");
	for(int i=0; i<object.size();i++) {
		System.out.println(object.get(i));
	}
		}
	}
	