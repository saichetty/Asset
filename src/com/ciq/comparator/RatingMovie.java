package com.ciq.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ciq.comparable.Movie;

public class RatingMovie implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		if (o1.getYear()<o2.getYear())
		return -1 ;
		if(o1.getYear()>o2.getYear())
			return 1;
		else
		return 0;
	}
	

	
	public static void main(String[] args) {
		
		
//	List<Movie> list = new ArrayList<>();
//	list.add(new Movie(3.5, "indra", 2000));
//	list.add(new Movie(2.5, "andhra", 2010));
//	list.add(new Movie(3.8, "telugu", 2009));
//	list.add(new Movie(4.5, "praneeth", 2020));
//	list.add(new Movie(5.5, "sai", 2004));
//	list.add(new Movie(3.3, "kumar", 2002));
//	
//	RatingMovie ratingMovie = new RatingMovie();
//	
//	System.out.println("Using Comparator: ");
//	
//	Collections.sort(list, ratingMovie);
//	
//	for(Movie movi: list) {
//		
//		System.out.println(movi.getName()+" "+ movi.getYear()+" "+movi.getRating());
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public	int compare(Integer i, Integer j) {
				
				if(i%10> j%10) 
					return 1;
				else 
					return -1;
				
			}
		};
	
		
		List<Integer> list = new ArrayList<>();
		
		list.add(29);
		list.add(35);
		list.add(63);
		list.add(20);
		list.add(32);
		
		Collections.sort(list,com);
		
		System.out.println(list);
		
	}	
	}