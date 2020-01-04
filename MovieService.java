package com.deloitte.estore.Service;

import java.sql.Connection;

import java.util.List;

import com.deloitte.estore.model.Movie;



public interface MovieService {
	boolean addMovie(Movie Movie ) throws Exception;
   
Movie getMovietById(int Id) throws Exception;
 


 
} 


