package com.deloitte.estore.repo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.estore.model.Movie;
public  class MovieRepoImpt implements MovieRepo {
	
Movie Movie=new Movie();
List<Movie> m=new ArrayList<>();
@Override
public boolean addMovie(Movie Movie) throws Exception {
	// TODO Auto-generated method stub
	
	m.add(Movie);
	if(m.size()!=0)
	{
		return true;
	}
	return false;
			}
	@Override
	public Movie getMovieById(int Id) throws Exception {
		// TODO Auto-generated method stub
	for(Movie Movie:m)
	{
		if(Id==Movie.getID())
	{
		return Movie;
	}
	}
	return null;
	}
	

	
}
