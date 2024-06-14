package com.movievalidation;

import java.time.LocalDate;
import java.util.List;

import com.movie.Movie;
import com.movie.MovieType;
import com.movieexception.MovieException;

public class MovieValidation {
	public static Movie ValidateMovieInput(String id,String name,String releaseDate,int rating,String movietype,List<Movie>movies) throws MovieException {
		String nid=ValidateID(id);
		String nname=ValidateName(name,movies);
		LocalDate newreleasedate=LocalDate.parse(releaseDate);
		LocalDate finaldate=ValidateDate(newreleasedate);
		MovieType mt=MovieType.valueOf(movietype);
		
		return new Movie(nid,nname,finaldate,rating,mt);
		
	}
	
	public static String ValidateID(String id) throws MovieException {
		if(!id.matches("^[a-zA-Z0-9]{8,100}$")) {
			throw new MovieException("Movie ID must be alpha numeric and length should be atlease 8: ");
		}
		return id;
	}
	
	public static String ValidateName(String name,List<Movie>movies) throws MovieException {
		for (Movie m : movies) {
			if (m.getName().equals(name)) {
				throw new MovieException("Movie Name already exists : ");
			}
		}
		return name;
	}
	public static LocalDate ValidateDate(LocalDate date1) throws MovieException {
		if(date1.isBefore(LocalDate.now())||date1.isEqual(LocalDate.now()))
		{
			throw new MovieException("Movie date must be of future ");
		}
		
		return date1;
		
	}

}
