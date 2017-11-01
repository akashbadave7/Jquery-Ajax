package com.bridgeit.HibernateCrud;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class MovieDaoImpl implements MovieDao{

	SessionFactory factory; 

	 public SessionFactory getFactory() {
		return factory;
	 }

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}


	@Override
	 public long createMovie(Movie movie) {
	  Session session = factory.openSession();
	  Transaction transaction = session.beginTransaction();
	  long id= (Long) session.save(movie);
	  transaction.commit();
	  session.close();
	  return id;
	 }

	@Override
	public Movie get(Movie getMovie) {
		return factory.getCurrentSession().get(Movie.class,getMovie.getMovieId());
	}

	@Override
	public List<Movie> list() {
			Session session = factory.openSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
	      Root<Movie> root = cq.from(Movie.class);
	      cq.select(root);
	      Query<Movie> query = session.createQuery(cq);
	      return query.getResultList();
	}

	@Override
	public void update(long id, Movie book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MovieDao movie) {
		Session session = factory.openSession();
		session.delete(movie);
		
	}

	@Override
	public Movie get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
