package com.ciq.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;
	
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public Movie() {
		super();
	}

	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		
		return (int) (o.rating-this.rating);
	}
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<>();
		list.add(new Movie(3.5, "indra", 2000));
		list.add(new Movie(2.5, "andhra", 2010));
		list.add(new Movie(3.8, "telugu", 2009));
		list.add(new Movie(4.5, "praneeth", 2020));
		list.add(new Movie(5.5, "sai", 2004));
		list.add(new Movie(3.3, "kumar", 2002));
		
		Collections.sort(list);
		
		System.out.println("Movie as per year order: ");
		
		for(Movie movie: list) {
			
			System.out.println(movie.getName()+" "+ movie.getYear()+" "+ movie.rating);
			
		}
		
		
		
	}

}
