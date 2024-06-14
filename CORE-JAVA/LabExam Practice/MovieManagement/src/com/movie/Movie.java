package com.movie;

import java.time.LocalDate;

public class Movie {
	private String id;
	private String name;
	private LocalDate releaseDate;
	private int rating;
	private MovieType movietype;
	private boolean status;
	
	public Movie(String id, String name, LocalDate releaseDate, int rating, MovieType movietype) {
		
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.movietype = movietype;
		this.status = true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public MovieType getMovietype() {
		return movietype;
	}

	public void setMovietype(MovieType movietype) {
		this.movietype = movietype;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", releaseDate=" + releaseDate + ", rating=" + rating
				+ ", movietype=" + movietype + ", status=" + status + "]";
	}
	
	
	
	

}
