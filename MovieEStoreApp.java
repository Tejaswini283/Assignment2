package com.deloitte.estore.applications;

import java.util.Scanner;

import com.deloitte.estore.Service.MovieService;
import com.deloitte.estore.Service.MovieServiceImpl;
import com.deloitte.estore.model.Movie;


public class MovieEStoreApp {
	public static void main(String[] args) {
		MovieService service=new MovieServiceImpl();
		try {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int ID=sc.nextInt();
		System.out.println("Enter the Name");
		String Name=sc.next();
		System.out.println("Enter the Showdate");
		String Showdate=sc.next();
		System.out.println("Enter the Showtime");
		int Showtime=sc.nextInt();
		System.out.println("Status");
		String Status=sc.next();
		Movie Movie=new Movie(ID,Name,Showdate,Showtime,Status);
				
	   
	    	if(service.addMovie(Movie))
	    	{
	    		System.out.println(" added");
	    	}
	    	else {
	    	System.out.println("not added");
	         }
	    	System.out.println("Enter the id");
	    	int s=sc.nextInt();
	    	Movie m=new Movie();
	    	
	    	m=service.getMovietById(s);
	    	
	    	if(m!=null)
	    	{
	    		System.out.println("Movie Id="+m.getID()+"Name"+m.getName()+"Showdate="+m.getShowdate()+"Showtime"+m.getShowtime()+"Status"+m.getStatus());
	    	}
	    }
	catch(Exception e) {
		e.printStackTrace();
	}
	    }
	}



