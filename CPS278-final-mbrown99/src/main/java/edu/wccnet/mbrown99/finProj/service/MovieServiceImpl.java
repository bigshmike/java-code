package edu.wccnet.mbrown99.finProj.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.mbrown99.finProj.dao.MovieDAO;
import edu.wccnet.mbrown99.finProj.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieDAO movieDAO;

	@Override
	public Map<String, String> populateRatings() {
		// TODO Auto-generated method stub
		return movieDAO.populateRatings();
	}

	@Override
	public Map<String, String> populateGenres() {
		// TODO Auto-generated method stub
		return movieDAO.populateGenres();
	}

	@Override
	@Transactional
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		movieDAO.addMovie(movie);
	}
	
	@Override
	@Transactional
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return movieDAO.getMovies();
	}

	@Override
	@Transactional
	public Movie getMovie(int id) {
		// TODO Auto-generated method stub
		return movieDAO.getMovie(id);
	}

}