/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import assignment2.Entity.Customer;
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
public class CustomerEJB {
 //Attributes 
    @PersistenceContext(unitName = "Assignment2PU")
    private EntityManager em;

    @Resource
    SessionContext ctx;


	
	
	
	//find all customer
    public List<Customer> findAllCustomer() {
        Query query = em.createNamedQuery("CD.findAllCustomer");
        return query.getResultList();
    }
	//find customer by name
    public Customer findCustomerByName(String name) {
        return em.find(Customer.class, name);
    }
	//create a Customer
	 public Customer createCustomer(Customer customer) {
        em.persist(customer);
		System.out.println(ctx.getCallerPrincipal().getName());
        return customer;
    }
	
	
}
