package com.deloitte.estore.Service;

import java.sql.Connection;

import java.util.List;

import com.deloitte.estore.model.Movie;
import com.deloitte.estore.repo.MovieRepo;
import com.deloitte.estore.repo.MovieRepoImpt;

public class MovieServiceImpl implements MovieService {
	MovieRepo repo= new MovieRepoImpt();
		
	
	@Override
	public boolean addMovie(Movie Movie) throws Exception {
		// TODO Auto-generated method stub
		return repo.addMovie(Movie);
	}
	
	
	@Override
	public Movie getMovietById(int Id) throws Exception {
		// TODO Auto-generated method stub
		return repo.getMovieById(Id);
	}
	
}
