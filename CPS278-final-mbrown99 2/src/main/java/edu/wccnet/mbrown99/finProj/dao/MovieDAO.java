package edu.wccnet.mbrown99.finProj.dao;

import java.util.List;
import java.util.Map;

import edu.wccnet.mbrown99.finProj.entity.Movie;

public interface MovieDAO {
	public Map<String, String> populateRatings();
	
	public Map<String, String> populateGenres();
	
	public void addMovie(Movie movie);
	
	public List<Movie> getMovies();
	
	public Movie getMovie(String movieInfo);
	
	public List<Movie> searchByInfo(String movieInfo);

}