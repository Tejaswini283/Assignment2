package com.deloitte.estore.repo;


	
	import java.sql.Connection;
	import  java.util.*;
	import com.deloitte.estore.model.Movie;
	public interface MovieRepo {

		
		     boolean addMovie(Movie Movie ) throws Exception;
		     
		  Movie getMovieById(int Id) throws Exception;
		  
	}
	



