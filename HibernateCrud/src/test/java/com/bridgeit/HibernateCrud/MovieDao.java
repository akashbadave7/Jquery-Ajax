package com.bridgeit.HibernateCrud;

import java.util.List;

public interface MovieDao {

	public long createMovie(Movie movie);
	
	Movie get(Movie getMovie);
	
	List<Movie> list();
	
	void update(long id, Movie book);
	
	void delete(MovieDao movie);

	Movie get(long id);
}
