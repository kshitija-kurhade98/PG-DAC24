package com.movieapplicationtester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.movie.Movie;
import com.movie.MovieType;
import com.movievalidation.MovieValidation;

public class MovieApplicationTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			List<Movie>movies=new ArrayList<>();
			
			boolean exit=false;
			
			try {
				while(!exit) {
					System.out.println("1. Add new Movie :"
							+ "\n2. Display all movies :"
							+ "\n3. Sort via release date :"
							+ "\n4. Set status to false by movie name: "
							+ "\n5. Remove movies with status as false :"
							+ "\n6. Set new rating via movie name :"
							+ "\n7. Display by movie type :\"");
					System.out.println("Enter choice :");
					int choice=sc.nextInt();
					
					switch (choice) {
					case 1:
						System.out.println("Enter Movie ID"
								+ "\nEnter Name"
								+ "\nEnter Release Date"
								+ "\nEnter rating"
								+ "\nMovie type");
						
						Movie m=MovieValidation.ValidateMovieInput(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(),movies);
						movies.add(m);
						System.out.println("Movie Added Successfully !!!!");
						break;

					case 2:
						for (Movie m1 : movies) {
							System.out.println(m1);
							
						}
						break;
					
					case 3:
						Collections.sort(movies,Comparator.comparing(Movie::getReleaseDate));
						for (Movie m1 : movies) {
							System.out.println(m1);
							
						}
						break;
						
					case 4:
						System.out.println("Enter movie name :");
						String moviename=sc.next();
						for (Movie m1 : movies) {
							if (m1.getName().equals(moviename)) {
								m1.setStatus(false);
								
							}
						}
						break;
					case 5:
						Iterator<Movie>it=movies.iterator();
						while(it.hasNext()) {
							Movie mt=it.next();
							if(mt.isStatus()==false) {
								it.remove();
								System.out.println("Removed movies with status as false :");
								
							}
									
							
						}
						
						
						break;
						
					case 6:
						System.out.println("Enter movie name and new rating  ");
						String movietype=sc.next();
						int newrating=sc.nextInt();
						
						for (Movie m2 : movies) {
							if(m2.getName().equals(movietype)) {
								m2.setRating(newrating);
							}
						}
						
					case 7:
						System.out.println("Enter movie type :");
						String mt=sc.next();
						
						MovieType newmt=MovieType.valueOf(mt);
						
						for (Movie m3 : movies) {
							if(m3.getMovietype().equals(newmt)) {
								System.out.println(m3);
							}
							
						}
						break;
						
					case 8:
						exit=true;
						
					default:
						break;
					}
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}

