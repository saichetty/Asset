package com.ArrayList;

import java.util.ArrayList;

// i/p: [1,2,3,4,2,5,4]
// o/p: [2,4]

public class Duplicate {
	public static void main(String[] args) {
		
		ArrayList<Integer> dup = new ArrayList<>();
		dup.add(1);
		dup.add(2);
		dup.add(3);
		dup.add(4);
		dup.add(2);
		dup.add(5);
		dup.add(4);
		
		System.out.println(dup);
		
		int s=0;
		
		for(int i=0; i<=dup.size();i++) {
		
			for(int j=1;j<=dup.size();j++) {
				if(i!=j) {
				
					System.out.println(i);
				}
			}
			
		}
		
		
	}

}
