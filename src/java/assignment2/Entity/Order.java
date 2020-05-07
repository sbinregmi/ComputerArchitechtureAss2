/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author prashant
 */
@Entity

@NamedQueries({
    @NamedQuery(name="findAll",query="select o from Order o"),
    @NamedQuery(name="findById", query="select o from Order o where o.id=:orderId")
})
public class Order implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String item;
    private int quantity;
    
    private Customer customerName;

    public Order() {
    }        

    public Order(Long id, String item, int quantity, Customer customerName) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.customerName = customerName;
    }      

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomerName() {
        return customerName;
    }

    public void setCustomerName(Customer customerName) {
        this.customerName = customerName;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
