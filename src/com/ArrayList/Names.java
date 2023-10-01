package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Names {
	public static void main(String[] args) {
		
		ArrayList names = new ArrayList();
		
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.add("sai");
		names.add("kumar");
		names.add("ch");
		names.add("praneeth");
		names.add("chetty");
		System.out.println(names);
		System.out.println(names.get(3));
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		System.out.println(names.remove(3));
		System.out.println(names);
		System.out.println(names.set(2, "hello"));
		System.out.println(names.contains("sai"));
		System.out.println(names);
		
		
		
		
		
	}
}
		

		
	