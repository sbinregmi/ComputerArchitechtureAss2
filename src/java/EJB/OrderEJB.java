/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import assignment2.Entity.Order;
import javax.annotation.Resource;
import javax.ejb.*;
import javax.ejb.SessionContext;
import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 *
 * @author SabinRegmi
 */
@Stateless
@LocalBean
public class OrderEJB {

     //Attributes 
    @PersistenceContext(unitName = "Assignment2PU")
    private EntityManager em;

    @Resource
    SessionContext ctx;


	
	
	
	
	//find all orders
    public List<Order> findAllOrder() {
        Query query = em.createNamedQuery("CD.findAllOrder");
        return query.getResultList();
    }
	//find order by Id
    public Order findOrderById(Long id) {
        return em.find(Order.class, id);
    }
	//create a Order
	 public Order createOrder(Order order) {
        em.persist(order);
		System.out.println(ctx.getCallerPrincipal().getName());
        return order;
    }
}
