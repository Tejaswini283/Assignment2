package com.deloitte.estore.model;

public class Movie {
	
			private int ID;
			private String Name;
			private String Showdate;
			private int Showtime;
			private String Status;
			public Movie()
			{
				
			}
			public int getID() {
				return ID;
			}
			
			public Movie(int iD, String name, String showdate, int showtime, String status) {
				super();
				ID = iD;
				Name = name;
				Showdate = showdate;
				Showtime = showtime;
				Status = status;
			}

			@Override
			public String toString() {
				return "Movie [ID=" + ID + ", Name=" + Name + ", Showdate=" + Showdate + ", Showtime=" + Showtime
						+ ", Status=" + Status + "]";
			}

			public void setID(int iD) {
				ID = iD;
			}
			public String getName() {
				return Name;
			}
			public void setName(String name) {
				Name = name;
			}
			public String getShowdate() {
				return Showdate;
			}
			public void setShowdate(String showdate) {
				Showdate = showdate;
			}
			public int getShowtime() {
				return Showtime;
			}
			public void setShowtime(int showtime) {
				Showtime = showtime;
			}
			public String getStatus() {
				return Status;
			}
			public void setStatus(String status) {
				Status = status;
			}

			
			
		}


