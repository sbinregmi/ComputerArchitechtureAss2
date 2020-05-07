/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import assignment2.Entity.Game;
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
public class GameEJB {

    //Attributes 
    @PersistenceContext(unitName = "Assignment2PU")
    private EntityManager em;

    @Resource
    SessionContext ctx;

   
	
	
	
	//find all games
    public List<Game> findAll() {
        Query query = em.createNamedQuery("Game.findAll");
        return query.getResultList();
    }

	//find game by name
	public Game findByTitle(String title) {
        return em.find(Game.class, title);
    }
	//create a game
	 public Game createGame(Game game) {
        em.persist(game);
		System.out.println(ctx.getCallerPrincipal().getName());
        return game;
    }
}
