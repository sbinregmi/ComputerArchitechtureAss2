/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import assignment2.Entity.Movie;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author SabinRegmi
 */
@Stateless
@LocalBean
public class MovieEJB {

     //Attributes 
    @PersistenceContext(unitName = "Assignment2PU")
    private EntityManager em;

    @Resource
    SessionContext ctx;

    //Public Methods   
	//find all movies
    public List<Movie> findMovies() {
        Query query = em.createNamedQuery("Book.findAllMovies");
        return query.getResultList();
    }

	//find movies by name
	public Movie findMovieByName(String name) {
        return em.find(Movie.class, name);
    }
	//create a movie
	 public Movie createMovie(Movie movie) {
        em.persist(movie);
		System.out.println(ctx.getCallerPrincipal().getName());
        return movie;
    }
	
}
