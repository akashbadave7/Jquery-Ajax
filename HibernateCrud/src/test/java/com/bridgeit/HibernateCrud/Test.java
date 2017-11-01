package com.bridgeit.HibernateCrud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
	  ApplicationContext appContext = new ClassPathXmlApplicationContext("app-config.xml");
	  Movie movieDao = (Movie) appContext.getBean("emp1");
	  MovieDao movie = (MovieDao) appContext.getBean("movieDao");

	  /*movie.createMovie(movieDao);*/
	  
	  Movie getMovie = (Movie) appContext.getBean("display");
	  List<Movie> list=movie.list();
	  System.out.println(list.get(0).getMovieId()+" "+list.get(0).getTitle()+" "+list.get(0).getDirector()+" "+list.get(0).getReleaseYear());
	  
	 }
}
